package com.example.demo;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadData {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\JsonFile\\User_table.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject userjsonobj = (JSONObject)obj ;
		
		String fname = (String) userjsonobj.get("firstName");
		String lname = (String) userjsonobj.get("lastName");
		
		System.out.println("First Name:" +fname);
		System.out.println("Last Name:" +lname);
		
		JSONArray array = (JSONArray)userjsonobj.get("address");
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject address = (JSONObject)array.get(i);
			
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			
			System.out.println("Address of " +i+ " is........");
			System.out.println("Street:" +street);
			System.out.println("city:" +city);
			System.out.println("state:" +state);
            
		}
		
	}

}
