package com.Carnation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Carnation.Service.UserService;
import com.Carnation.model.User;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService us;

	@PostMapping("/save-user")
	public User saveUser(@RequestBody User user) {

		return us.saveUser(user);
	}

	@GetMapping("/get-all")
	public List<User> getAllUsers() {
		return us.getAllUsers();
	}

	@GetMapping("/get-user")
	public User getUserById(@RequestParam("id") Long id) {
		return us.getUserById(id);

	}

}
