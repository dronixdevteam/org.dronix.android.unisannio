/*******************************************************************************
 * Copyright 2012 Ivan Morgillo
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.dronix.android.unisannio.activity;

import org.dronix.android.unisannio.NewsIng;
import org.dronix.android.unisannio.R;
import org.dronix.android.unisannio.R.id;
import org.dronix.android.unisannio.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class NewsDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newsdetail);

		Bundle b = getIntent().getExtras();
		NewsIng news = b.getParcelable("newsing");
		
		TextView title = (TextView) findViewById(R.id.title);
		WebView description = (WebView) findViewById(R.id.description);
		TextView pubDate = (TextView) findViewById(R.id.date);
		
		pubDate.setText(news.getPubDate());
		title.setText(news.getTitle());
		description.loadData(news.getDescription(), "text/html", null);
	}
}