package com.tt.androiduidemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.tt.androiduidemo.ui.TextViewActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	private String[] controls = new String[] { "TextView" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v("tt", "0");
		super.onCreate(savedInstanceState);
		Log.v("tt", "1");
		setContentView(R.layout.activity_main);
		Log.v("tt", "2");
		ListView listview = (ListView) findViewById(R.id.lvUITitle);
		SimpleAdapter adapter = new SimpleAdapter(this, GetData(),
				R.layout.mainlistitem, new String[] { "title" },
				new int[] { R.id.listitem });
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new MyListItemClick());
	}

	private List<HashMap<String, String>> GetData() {
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		for (String ui : controls) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("title", ui);
			list.add(map);
		}
		return list;
	}

	class MyListItemClick implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			Class<?> obj = null;
			switch (position) {
			case 0:
				obj = TextViewActivity.class;
				break;
			default:
				break;
			}
			if (obj != null) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, obj);
				startActivity(intent);
			}
		}

	}
}