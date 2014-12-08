package services;

import java.util.ArrayList;
import java.util.List;

import model.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<User> getAllUsers(){
		User u1 = new User("John Doe");
		User u2 = new User("Tim Cook");
		User u3 = new User("Abraham Lincoln");
		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		return users;
	}
}
