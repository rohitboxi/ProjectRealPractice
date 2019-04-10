package com.pack.exceptions;

public class AuthenticationException extends Exception {
	
	public AuthenticationException(Exception e) {
		System.out.println("Autentication failed... Please try again");
	}

	public AuthenticationException() {
		// TODO Auto-generated constructor stub
		System.out.println("Autentication failed... Please try again");
	}
}
