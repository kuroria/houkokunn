package com.kuroria.houkokunnkari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void reizouko(View v) {
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_MAIN);
		intent.setClass(MainActivity.this, gamenn2.class);
		startActivity(intent);

	}

	public void reitouko(View v) {
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_MAIN);
		intent.setClass(MainActivity.this, gamenn3reitouko.class);
		startActivity(intent);

	}
}
