package com.kuroria.houkokunnkari;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Reizoukotuika extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reizoukotuika);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reizoukotuika, menu);
		return true;
	}

}
