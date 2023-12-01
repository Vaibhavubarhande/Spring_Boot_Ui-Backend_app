package com.Carnation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Carnation.dao.UserRepository;
import com.Carnation.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository ur;

	public User saveUser(User user) {

		return ur.save(user);
	}

	public List<User> getAllUsers() {
		return ur.findAll();
	}

	public User getUserById(Long id) {
		return ur.findById(id).get();

	}

}
