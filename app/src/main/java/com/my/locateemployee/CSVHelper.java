package com.my.locateemployee;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSVHelper {
//	private static ArrayList<String> csvEmpId = new ArrayList<>();
	
	public static ArrayList<Employee> readEmployees(Context context) {
		
		ArrayList<Employee> list = new ArrayList<>();
	//	ArrayList<String> csvEmpId = new ArrayList<>();
		
		
		try {
			InputStream is = context.getAssets().open("employee.csv");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				
				String[] data = line.split(",");
				
				String id = data[0];
				String name = data[1];
				String designation = data[5];
				String phone = data[18];
				String mail=data[19];
				String reportingId=data[16];
				String reporting=data[17];
				
				//For Store EmpId only
				//csvEmpId.add(data[0]);
				
				
				Employee emp = new Employee(id, name, designation, phone,mail,reportingId,reporting);
				list.add(emp);
			}
			
			reader.close();
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
	
}