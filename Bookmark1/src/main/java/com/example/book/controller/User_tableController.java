package com.example.book.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.book.entity.User_table;
import com.example.book.service.User_tableService;

@Controller
public class User_tableController {

    private final User_tableService user_tableService;

  
    public User_tableController(User_tableService user_tableService) {
    	super();
        this.user_tableService = user_tableService;
    }

    // Handler method to handle the list of user_tables and return the model and view
    @GetMapping("/user_table")
    public String listUser_table(Model model) {
        model.addAttribute("user_tables", user_tableService.getAllUser_table());
        return "user_tables";
    }

    // This method is used to create a new User_table object for the form
    @GetMapping("/user_table/new")
    public String createUser_tableForm(Model model) {
        User_table user_table = new User_table();
        model.addAttribute("user_table", user_table);
        return "create_user_table";
    }

    // This method is used to save a new User_table object submitted from the form
    @PostMapping("/user_table")
    public String saveUser_table(@ModelAttribute("user_table") User_table user_table) {
        user_tableService.saveUser_table(user_table);
        return "redirect:/user_table"; // Change to the correct URL if needed
    }
    
    
//    @GetMapping("/user_table/edit/{user_id}")
//    public String editUser_tableForm(@PathVariable int user_id,Model model) {
//   	 model.addAttribute("user_table", user_tableService.getUser_tableById(user_id));
//   	return "edit_user_table";
//    }
    
    @GetMapping("/user_table/edit/{user_id}")
    public String editUser_tableForm(@PathVariable("user_id") int user_id, Model model) {
        model.addAttribute("user_table", user_tableService.getUser_tableById(user_id));
        return "edit_user_table";
    }

    
    @PostMapping("/user_table/{user_id}")
    public String updateUser_table(@PathVariable int  user_id,
    		@ModelAttribute("user_table") User_table user_table,
    		Model model) {
    	
    	//get user_table from database by user_id
    	User_table existingUser_table = user_tableService.getUser_tableById(user_id);
    	existingUser_table.setUser_id(user_table.getUser_id());
    	existingUser_table.setUser_name(user_table.getUser_name());
    	existingUser_table.setLast_updated_date(user_table.getLast_updated_date());
    	existingUser_table.setLast_updated_user(user_table.getLast_updated_user());
    	existingUser_table.setLast_transaction_id(user_table.getLast_transaction_id());
    	
    	//save updated student object
    	user_tableService.updateUser_table(existingUser_table);
    	return "redirect:/user_tables";
    }
}

