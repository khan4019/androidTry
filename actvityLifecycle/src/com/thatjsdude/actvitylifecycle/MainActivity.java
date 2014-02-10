package com.thatjsdude.actvitylifecycle;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText etName, etEmail, etPhone;
	private static final int PHONE_NUMBER = 0;
	//finished untill 36.36 of second video of third lecture
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText)findViewById(R.id.etName);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etPhone = (EditText)findViewById(R.id.etPhone);
        
    }
    
    public void submit(View v){
    	String name = etName.getText().toString();
    	String email = etEmail.getText().toString();
    	String phone = etPhone.getText().toString();
    	    	
    	Person person = new Person (name, email, phone);
    	    	
    	Intent intent = new Intent(this, AnotherActivity.class);
    	intent.putExtra("person", person);
    	    	
    	startActivity(intent);    	
    }    
    
    public void getNumber(View v){
    	Intent intent = new Intent(this, PhoneNumberSubActivity.class);
    	startActivityForResult(intent, PHONE_NUMBER);
    }
    
    public void call(View v){
    	String number =etPhone.getText().toString();
    	Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number));
    	startActivity(intent);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
    	if(requestCode == PHONE_NUMBER){
    		if(resultCode == Activity.RESULT_OK){
    			String number = data.getStringExtra("number");
    			etPhone.setText(number);
    		}
    		else{
    			Log.e("MainActivity", "sub Activity cancelled");
    		}
    	}
    }	
}
