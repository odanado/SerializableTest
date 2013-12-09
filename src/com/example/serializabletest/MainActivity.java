package com.example.serializabletest;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    private ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	

	arrayList.add("1");
	arrayList.add("2");
	arrayList.add("3");
    }
    
    public void doAction(View view) {
	Intent intent = new Intent(this, com.example.serializabletest.OtherActivity.class);
	intent.putExtra("list", arrayList);
	this.startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

}
