package com.sbi;

import in.sanjay.security.Pwdsecurityservice;

public class UserRegistation {

	public static void main(String[] args) {
		
		Pwdsecurityservice pss = new Pwdsecurityservice();

		 String encode = pss.encord("sanjay biswal65");

		 System.out.println(encode);
		 
	}

}
