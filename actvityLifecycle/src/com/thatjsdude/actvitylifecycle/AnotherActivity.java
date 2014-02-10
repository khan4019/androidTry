package com.thatjsdude.actvitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {
	
	private TextView tvOutput;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		tvOutput = (TextView)findViewById(R.id.tvOutput);
				
		Person person = (Person)getIntent().getSerializableExtra("person");
		String name = person.getName();
		String email = person.getEmail();
		String phone = person.getPhone();
		
		tvOutput.setText(person.toString());
	}

}
