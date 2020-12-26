package com.gopal.EmailValidation;

import java.util.regex.Pattern;

public class EmailValidOrNot {
	public static boolean isValid(String Email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
			Pattern pat = Pattern.compile(emailRegex); 
			if (Email == null) 
			return false; 
			return pat.matcher(Email).matches();
	}

	public static void main(String[] args) {
		String email = "jimmy.rathore2@gmail.com"; 
        if (isValid(email)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
		

	}

}
