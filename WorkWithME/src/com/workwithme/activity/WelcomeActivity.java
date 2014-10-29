package com.workwithme.activity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends ActionBarActivity implements OnClickListener{

	TextView tv_Welcome,tv_Account,tv_headline;
	Button btn_login,btn_signup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		fullScreen();
		tv_Welcome = (TextView)findViewById(R.id.tv_welcome);
		tv_Account = (TextView)findViewById(R.id.tv_account);
		tv_headline = (TextView)findViewById(R.id.tv_headline);
		btn_login = (Button)findViewById(R.id.btn_login);
		btn_signup = (Button)findViewById(R.id.btn_signup);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	private void fullScreen()
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if( v.getId() == R.id.btn_login){
			Intent loginPage = new Intent(WelcomeActivity.this,LoginActivity.class);
		}
		
		if( v.getId() == R.id.btn_signup){
			Intent signinPage = new Intent(WelcomeActivity.this,SignUpActivity.class);
		}
	}
}
