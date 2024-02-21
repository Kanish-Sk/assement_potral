package com.portal.assement;

import java.util.Scanner;

import com.portal.assement.concret.User;
import com.portal.assement.controller.UserController;
import com.portal.assement.services.AssementQuestions;

public class AssementExcecuter {
	public static void main(String[] args) {
		User CurrentUser;
		Scanner sc = new Scanner(System.in);
		UserController userController = new UserController();
		do {
			System.out.println("1 -> login 2 -> Register");
			switch(sc.nextInt()) {
			case 1 :
				CurrentUser = userController.UserLogIn(sc);
				AssementQuestions ques = new AssementQuestions();
				int score = ques.Assessment();
				CurrentUser.setAssementMark(score);
				break;
			case 2:
				userController.userRegister(sc);
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
			System.out.println("Enter Y to Continue");
		} while(sc.next().charAt(0) == 'Y');
	}
}
