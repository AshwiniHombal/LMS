package com.example.book.service;
import java.util.List;

import com.example.book.entity.User_table;

public interface User_tableService {
 List<User_table> getAllUser_table();
 
 User_table saveUser_table(User_table user_table);

User_table getUser_tableById(int user_id);

User_table updateUser_table(User_table user_table);

}
