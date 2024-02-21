package com.portal.assement.controller;

import java.util.Scanner;

import com.portal.assement.concret.User;
import com.portal.assement.services.UserService;

public class UserController {
	UserService userService = new UserService();
	public User UserLogIn(Scanner sc) {
		System.out.println("LOGIN");
		System.out.println("Enter the user name: ");
		String name = sc.next();
		System.out.println("Enter the Passowrd: ");
		String password = sc.next();
		User currentUser = userService.logIn(name, password);
		if(currentUser == null) {
			System.out.println("User not exists.");
			userRegister(sc);
		} else {	
			System.out.println("Logged in succesfully!!!");
		}
		return currentUser;
		
	}
	
	public void userRegister(Scanner sc) {
		System.out.println("REGISTER");
		System.out.println("Enter the User name: ");
		String userName = sc.next();
		System.out.println("Enter the Full name: ");
		String fullName = sc.next();
		System.out.println("Enter the Passowrd: ");
		String password = sc.next();
		
		if(userService.checkExistingUser(userName)) {
			System.err.println("User Already exisits :(");
		} else if(userService.register(userName, fullName, password)) {
			System.out.println("User created sucessfully :)");
			UserLogIn(sc);
		}
		
	}
}
