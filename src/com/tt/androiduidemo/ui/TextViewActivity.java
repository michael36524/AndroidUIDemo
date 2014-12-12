package com.tt.androiduidemo.ui;

import com.tt.androiduidemo.R;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

public class TextViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_view);
		TextView textview = (TextView) findViewById(R.id.tvMyTextView);
		textview.setText(R.string.textview_code);
		textview.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20); // size "20sp"
		textview.setBackgroundResource(R.color.blue); // background color
		textview.setTextColor(android.graphics.Color.RED); // text color
		textview.setGravity(Gravity.CENTER); // gravity
		textview.setTypeface(Typeface.create("sans", Typeface.BOLD)); // typeface
	}
}
