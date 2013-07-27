package com.shunix.portalsnav.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.shunix.portalsnav.R;
import com.shunix.portalsnav.fragments.DownloadFragment;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.container_layout);
		getSupportFragmentManager().beginTransaction().add(R.id.container, new DownloadFragment()).commit();
	}

}