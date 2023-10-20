package com.example.book.entity;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User_table {
	 @Id
	 
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming you are using auto-generated primary keys
	    private int user_id;
	 
	    private String first_name;
	    private Date last_updated_date;

	  

		public int getUser_id() {
			return user_id;
		}



		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}



		public String getFirst_name() {
			return first_name;
		}



		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}



		public Date getLast_updated_date() {
			return last_updated_date;
		}



		public void setLast_updated_date(Date last_updated_date) {
			this.last_updated_date = last_updated_date;
		}



		public void setuser_id(Object object) {
			// TODO Auto-generated method stub
			
		}
	}      