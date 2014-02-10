package com.thatjsdude.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText etOp1, etOp2;
	TextView txtResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etOp1 = (EditText)findViewById(R.id.etOperand1);
		etOp2 = (EditText)findViewById(R.id.etOperand2);
		txtResult = (TextView)findViewById(R.id.tvOutput);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void add(View v) {
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		
		if(!op1Str.equals("") && !op2Str.equals("")){
			double operand1 = Double.parseDouble(op1Str);
			double operand2 = Double.parseDouble(op2Str);		
			double result = operand1 + operand2;		
			txtResult.setText("Result = "+result);
		}
		else{
			txtResult.setText("Please insert both the operands");
		}
		
				
	}
	
	public void subtract(View v){
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		
		if(!op1Str.equals("") && !op2Str.equals("")){
			double operand1 = Double.parseDouble(op1Str);
			double operand2 = Double.parseDouble(op2Str);		
			double result = operand1 - operand2;		
			txtResult.setText("Result = "+result);
		}
		else{
			txtResult.setText("Please insert both the operands");
		}
	}
	public void multi(View v){
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		
		double operand1 = Double.parseDouble(op1Str);
		double operand2 = Double.parseDouble(op2Str);
		
		double result = operand1 * operand2;
		
		txtResult.setText("Result = "+result);
	}
	public void divison(View v){
		String op1Str = etOp1.getText().toString();
		String op2Str = etOp2.getText().toString();
		
		double operand1 = Double.parseDouble(op1Str);
		double operand2 = Double.parseDouble(op2Str);
		
		double result = operand1 / operand2;
		
		txtResult.setText("Result = "+result);
	}
}
