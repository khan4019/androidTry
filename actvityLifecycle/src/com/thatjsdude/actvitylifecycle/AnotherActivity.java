package com.thatjsdude.actvitylifecycle;

import android.app.Activity;
import android.os.Bundle;

public class AnotherActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);		
	}

}
