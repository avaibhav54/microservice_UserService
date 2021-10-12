package com.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entities.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list=List.of(
			new User(1, "Vaibhav agarwal", "7906544082"),
			new User(2, "ram agarwal", "8433070451"),
			new User(3, "shaam agarwal", "8881449067")
			
			);
	@Override
	public User getUser(int id) {
	
		return this.list.stream().filter(user -> user.getUserId()==id).findAny().orElse(null);
		
	}

}
