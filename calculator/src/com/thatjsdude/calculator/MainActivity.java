package com.thatjsdude.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText etOp1, etOp2;
	TextView txtResult;
	Button btnPlus, btnMinus, btnMulti, btnDivison;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etOp1 = (EditText)findViewById(R.id.etOperand1);
		etOp2 = (EditText)findViewById(R.id.etOperand2);
		txtResult = (TextView)findViewById(R.id.tvOutput);
		btnPlus = (Button)findViewById(R.id.btnPlus);
		btnMinus = (Button)findViewById(R.id.btnMinus);
		btnMulti = (Button)findViewById(R.id.btnMulti);
		btnDivison = (Button)findViewById(R.id.btnDivision);
		
		btnPlus.setOnClickListener(buttonListener);
		btnMinus.setOnClickListener(buttonListener);
		btnMulti.setOnClickListener(buttonListener);
		btnDivison.setOnClickListener(buttonListener);
	}
	
	OnClickListener buttonListener=new OnClickListener(){
		@Override
		public void onClick(View v){
			String op1Str = etOp1.getText().toString();
			String op2Str = etOp2.getText().toString();
			
			if(!op1Str.equals("") && !op2Str.equals("")){
				double operand1 = Double.parseDouble(op1Str);
				double operand2 = Double.parseDouble(op2Str);		
				double result = 0;			
				switch(v.getId()){
				
				case R.id.btnPlus:
					result = operand1 + operand2;
					break;
				case R.id.btnMinus:
					result = operand1 - operand2;
					break;
				case R.id.btnMulti:
					result = operand1 * operand2;
					break;
				case R.id.btnDivision:
					result = operand1 / operand2;
					break;
				default:
					break;
				}
				txtResult.setTextColor(Color.BLACK);
				txtResult.setText("Result = "+result);
			}
			else{
				txtResult.setTextColor(Color.RED);
				txtResult.setText("Please insert both the operands");
			}	
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

//	public void add(View v) {
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		
//		if(!op1Str.equals("") && !op2Str.equals("")){
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);		
//			double result = operand1 + operand2;		
//			txtResult.setText("Result = "+result);
//		}
//		else{
//			txtResult.setText("Please insert both the operands");
//		}
//		
//				
//	}
//	
//	public void subtract(View v){
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		
//		if(!op1Str.equals("") && !op2Str.equals("")){
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);		
//			double result = operand1 - operand2;		
//			txtResult.setText("Result = "+result);
//		}
//		else{
//			txtResult.setText("Please insert both the operands");
//		}
//	}
//	public void multi(View v){
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		
//		double operand1 = Double.parseDouble(op1Str);
//		double operand2 = Double.parseDouble(op2Str);
//		
//		double result = operand1 * operand2;
//		
//		txtResult.setText("Result = "+result);
//	}
//	public void divison(View v){
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		
//		double operand1 = Double.parseDouble(op1Str);
//		double operand2 = Double.parseDouble(op2Str);
//		
//		double result = operand1 / operand2;
//		
//		txtResult.setText("Result = "+result);
//	}

//	@Override
//	public void onClick(View v) {
//		
//		String op1Str = etOp1.getText().toString();
//		String op2Str = etOp2.getText().toString();
//		
//		if(!op1Str.equals("") && !op2Str.equals("")){
//			double operand1 = Double.parseDouble(op1Str);
//			double operand2 = Double.parseDouble(op2Str);		
//			double result = 0;			
//			switch(v.getId()){
//			
//			case R.id.btnPlus:
//				result = operand1 + operand2;
//				break;
//			case R.id.btnMinus:
//				result = operand1 - operand2;
//				break;
//			case R.id.btnMulti:
//				result = operand1 * operand2;
//				break;
//			case R.id.btnDivision:
//				result = operand1 / operand2;
//				break;
//			default:
//				break;
//			}
//			txtResult.setTextColor(Color.BLACK);
//			txtResult.setText("Result = "+result);
//		}
//		else{
//			txtResult.setTextColor(Color.RED);
//			txtResult.setText("Please insert both the operands");
//		}		
//	}
}
