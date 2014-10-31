package com.workwithme.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends Activity implements OnClickListener{

	
	public Button btn_confirm,btn_cancel;
	public TextView tv_username,tv_password;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		fullScreen();
		
	}
	
	
	private void fullScreen()
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(btn_confirm.getId() == R.id.btn_confirm){
			
			
		}
		
		if(btn_cancel.getId() == R.id.btn_cancel){
			
		}
	}

	
	
}
