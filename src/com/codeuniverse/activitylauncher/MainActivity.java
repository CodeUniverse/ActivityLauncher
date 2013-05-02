/*
 * Copyright (C) 2013 Code Universe. All rights reserved.
 * 
 * http://www.codeuniverse.org
 * 
 * Created by Jaison Brooks 4/26/2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeuniverse.activitylauncher;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button button;
	Button button1;
	Button button2;
	Button button3;
	Button button4;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				String url = "http://www.codeuniverse.org";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
				finish();

			}
		});
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				final Intent intent = new Intent(Intent.ACTION_MAIN, null);

				intent.addCategory(Intent.CATEGORY_LAUNCHER);

				final ComponentName cn = new ComponentName(
						"com.android.browser",
						"com.android.browser.BrowserActivity");

				intent.setComponent(cn);

				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

				startActivity(intent);
			}
			});
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				final Intent intent = new Intent(Intent.ACTION_MAIN, null);

				intent.addCategory(Intent.CATEGORY_LAUNCHER);

				final ComponentName cn = new ComponentName(
						"com.android.calendar",
						"com.android.calendar.AllInOneActivity");

				intent.setComponent(cn);

				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

				startActivity(intent);

			}
		});
		button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				final Intent intent = new Intent(Intent.ACTION_MAIN, null);

				intent.addCategory(Intent.CATEGORY_LAUNCHER);

				final ComponentName cn = new ComponentName(
						"com.android.contacts",
						"com.android.contacts.DialtactsContactsEntryActivity");

				intent.setComponent(cn);

				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

				startActivity(intent);

			}
		});
		button2 = (Button) findViewById(R.id.button2);

		button2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				final Intent intent = new Intent(Intent.ACTION_MAIN, null);

				intent.addCategory(Intent.CATEGORY_LAUNCHER);

				final ComponentName cn = new ComponentName(
						"com.android.settings",
						"com.android.settings.wifi.WifiSettings");

				intent.setComponent(cn);

				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
