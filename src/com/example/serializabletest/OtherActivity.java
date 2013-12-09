/**
 * 
 */
package com.example.serializabletest;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author odan
 *
 */
public class OtherActivity extends Activity{
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.other_main);
	
	Intent intent = this.getIntent();
	ArrayList<String> arrayList = (ArrayList<String>) intent.getSerializableExtra("list");
	Toast.makeText(this, arrayList.get(0), Toast.LENGTH_SHORT).show();
	
    }
    
    public void doAction(View view) {
	Intent intent = new Intent(this, com.example.serializabletest.MainActivity.class);
	intent.putExtra("hoge", "value");
	this.startActivity(intent);
    }

}
