package com.thatjsdude.actvitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void submit(View v){
    	Intent intent = new Intent(this, AnotherActivity.class);
    	startActivity(intent);
    	finish();
    }
    
    
    
    @Override
    public void onConfigurationChanged(Configuration newConfig){
    	super.onConfigurationChanged(newConfig);
    	
    	if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
    		Log.d("MainActivity", "New Configuration: Landscape");    		
    	}
    	else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
    		Log.d("MainActivity", "New Configuration: Landscape");
    	}
    }
}
