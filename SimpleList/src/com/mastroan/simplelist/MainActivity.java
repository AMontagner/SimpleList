package com.mastroan.simplelist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	
	 ListView myList;
	 
     
	 
	    String[] listContent = {
	 
	            "January",
	 
	            "February",
	 
	            "March",
	 
	            "April",
	 
	            "May",
	 
	            "June",
	 
	            "July",
	 
	            "August",
	 
	            "September",
	 
	            "October",
	 
	            "November",
	 
	            "December"
	 
	    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myList = (ListView) findViewById(R.id.list);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice,
		 
		        listContent);
		
		myList.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
