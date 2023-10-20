package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.User_table;
import com.example.demo.Repository.User_tableRepository;

@RestController
public class HomeController {
	@Autowired
	private User_tableRepository user_tableRepository;
	@GetMapping("/")
	public String index() {
		return "welcome";
			}
//	fetch
	@GetMapping("/getAllUser_table")
	public List<User_table> getAll() {
		List<User_table> user_tablelist = user_tableRepository.findAll();
		return  user_tablelist;
	}
//	insert
	@PostMapping("/saveUser_table")
		public User_table saveData(@RequestBody User_table user_table) {
		user_tableRepository.save(user_table);
		return user_table;
	}
//	delete
	@DeleteMapping("/deleteUser_table/{user_id}")
	public String deleteUser_table(@PathVariable int user_id) {
	    // Delete the user based on the user_id.
	    // You may perform the deletion operation here.
	    return "deleted successfully";
	}

	

//	update
	@PutMapping("/update/{user_id}")
	public User_table updateUser_tableData(@PathVariable int user_id,@RequestBody User_table updateuser_table) {
		user_tableRepository.save(updateuser_table);
	return updateuser_table;
	}
}
