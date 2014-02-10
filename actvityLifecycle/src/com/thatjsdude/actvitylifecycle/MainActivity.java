package com.thatjsdude.actvitylifecycle;

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
}
