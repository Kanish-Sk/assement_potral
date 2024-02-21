package com.portal.assement.services;

import java.util.ArrayList;

import com.portal.assement.concret.User;

public class UserService {
	 static ArrayList<User> users = new ArrayList<>();
	static {
		users.add(new User("Mithun", "1234", "Mithun Kumar", 0));
		users.add(new User("Dhinesh", "1234", "Dhinesh Kumar", 0));
		users.add(new User("Karan", "1234", "Karan Kumar", 0));
	}
	
	public boolean checkExistingUser(String name) {
	    return users.stream()
	                .anyMatch(u -> name.equals(u.getUserName()));
	}
	
	
	public User logIn(String name, String password) {
		for(User u : users) {
			if(name.equals(u.getUserName()) && password.equals(u.getPassword())) {
				return u;
			}
		}
		return null;
	}
	
	public boolean register(String userName, String fullName, String password) {
		return users.add(new User(userName, password, fullName, 0)) ? true : false;
	}

}
