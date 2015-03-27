package com.way.activity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import com.way.swipeback.SwipeBackActivity;
import com.way.xx.R;

public class AboutActivity extends SwipeBackActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		TextView tv = (TextView) findViewById(R.id.app_information);
		Linkify.addLinks(tv, Linkify.ALL);
	}
}
