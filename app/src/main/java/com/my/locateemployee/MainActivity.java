package com.my.locateemployee;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.content.Intent;
import android.view.View;



public class MainActivity extends Activity {
	
	LinearLayout empCard;
	LinearLayout attendanceCard;
	LinearLayout reportCard;
	LinearLayout settingCard;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		empCard = findViewById(R.id.employeeLayout);
		attendanceCard = findViewById(R.id.attendanceLayout);
		reportCard = findViewById(R.id.reportLayout);
		settingCard = findViewById(R.id.settingsLayout);
		
		
		settingCard.animate()
   .translationX(300)
   .setDuration(3000)
   .withEndAction(new Runnable() {
       @Override
       public void run() {
           settingCard.animate()
              .translationX(0)
              .setDuration(3000)
              .start();
       }
   })
   .start();	
   	
		
		empCard.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(MainActivity.this,
				EmployeeActivity.class);
				
				startActivity(i);
			}
		});
	}
}