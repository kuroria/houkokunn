package com.kuroria.houkokunnkari;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Reitoukotuika extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reitoukotuika);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reitoukotuika, menu);
		return true;
	}

}
