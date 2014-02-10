package com.thatjsdude.actvitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PhoneNumberSubActivity extends Activity {
	
	private EditText etPhoneNumber;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phone_number_sub);
		etPhoneNumber = (EditText)findViewById(R.id.etNumber);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.phone_number_sub, menu);
		return true;
	}
	
	public void submit(View v){
		String number = etPhoneNumber.getText().toString();
		Intent data = new Intent();
		data.putExtra("number", number);
		setResult(Activity.RESULT_OK, data);
		finish();
	}

}
