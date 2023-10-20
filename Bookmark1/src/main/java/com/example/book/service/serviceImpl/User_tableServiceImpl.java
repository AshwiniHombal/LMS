package com.example.book.service.serviceImpl;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.book.entity.User_table;
import com.example.book.repository.User_tableRepository;
import com.example.book.service.User_tableService;
@Service
public class User_tableServiceImpl implements User_tableService{
	private User_tableRepository user_tableRepository;
	
	public User_tableServiceImpl(User_tableRepository user_tableRepository) {
		super();
		this.user_tableRepository = user_tableRepository;
	}
	@Override
	public List<User_table> getAllUser_table() {
		
		return user_tableRepository.findAll();
	}
	@Override
	public User_table saveUser_table(User_table user_table) {
		// TODO Auto-generated method stub
		return user_tableRepository.save(user_table);
	}
	
	@Override
	public User_table getUser_tableById(int user_id) {
		return user_tableRepository.findById(user_id).get();
	}
	@Override
	public User_table updateUser_table(User_table user_table) {
		
		return user_tableRepository.save(user_table);
	}
}
