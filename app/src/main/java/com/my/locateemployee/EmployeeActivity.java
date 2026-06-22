package com.my.locateemployee;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Handler;
import android.text.InputFilter;
import java.util.ArrayList;
import android.content.Intent;
// import androidx.appcompat.app.AppCompatActivity;

public class EmployeeActivity extends Activity {
	
	EditText etEmpId;
	Button btnSearch;
	
	EditText txtEmpId;
	EditText txtName;
	EditText txtDesignation;
	EditText txtPhone;
	EditText txtMail;
	EditText txtReporting;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_employee);
		
		etEmpId = findViewById(R.id.etEmpId);
		btnSearch = findViewById(R.id.btnSearch);
		
		txtEmpId = findViewById(R.id.txtEmpId);
		txtName = findViewById(R.id.txtName);
		txtDesignation = findViewById(R.id.txtDesignation);
		txtPhone = findViewById(R.id.txtPhone);
		txtMail = findViewById(R.id.txtMail);
		txtReporting=findViewById(R.id.txtReporting);
		
		
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(EmployeeActivity.this, MainActivity.class);
				startActivity(intent);
				finishAffinity();
			}
		}, 300000);
		
		
		
		
		ArrayList<Employee> employees;
		
		
	
		// Inputs become Uppercase while typing ... 
		etEmpId.setFilters(new InputFilter[] {
			new InputFilter.AllCaps()
		});
		
		// ends here
		
		
		employees = CSVHelper.readEmployees(this);
		
		// Example: show first employee
		
	
		
		
		btnSearch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				String empId = etEmpId.getText().toString().trim().toUpperCase();
				
				
				
				
				
				if(!empId.isEmpty()) {
					
					
					
					for(int i=0;i<employees.size();i++){
						Employee e=employees.get(i);
			
			if(String.valueOf(e.getId()).equals(empId)){
				
				Toast.makeText(EmployeeActivity.this,"Success",Toast.LENGTH_LONG).show();
				
				txtEmpId.setText(e.getId());
				txtName.setText(e.getName());
				txtDesignation.setText(e.getDesignation());
				txtPhone.setText(e.getPhone());
				txtMail.setText(e.getMail());
				txtReporting.setText(e.getReportingId()+" - "+e.getReporting());
				
				
			}
									
					}
					
					
					
					return;
				}
				
			
			}
		});
	}
}