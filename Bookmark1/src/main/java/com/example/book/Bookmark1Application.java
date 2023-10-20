package com.example.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.book.entity.User_table;
import com.example.book.repository.User_tableRepository;

@SpringBootApplication
public class Bookmark1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Bookmark1Application.class, args);
	}
@Autowired
private User_tableRepository user_tableRepository;
	@Override
	public void run(String... args) throws Exception {
		
		User_table user_table1 = new User_table( 01 ,"Ashwini", "2023-08-07", "sdfghj","1001");
		user_tableRepository.save(user_table1);
		
		User_table user_table2 = new User_table ( 02 ,"Anagha", "2023-03-08", "hgftre","1002");
		user_tableRepository.save(user_table2);
		
		User_table user_table3 = new User_table ( 03 ,"vaishnavi", "2023-02-05", "ertgh","1003");
		user_tableRepository.save(user_table3);
	}
}
