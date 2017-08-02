package com.elevator;

import java.util.Scanner;

/**
 * 
 * @author ryan.wong
 *	view class for getting the user input
 */
public class View {
	private String request = null;
	
	public String getRequest(){
		Scanner scanner = new Scanner(System.in);
		request = scanner.nextLine();
		scanner.close();
		return request;
	}
}
