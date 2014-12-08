package controllers;

import java.util.List;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import services.UserService;

@Component
@Scope("session")
public class UserController {
	
	@Autowired
	UserService userService;
	
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
}
