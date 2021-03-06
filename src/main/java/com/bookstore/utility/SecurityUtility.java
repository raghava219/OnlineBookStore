package com.bookstore.utility;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtility{

	private static final String SALT = "salt"; /* Salt should be protected carefully, we shouldn't use a simple string rathe 
    we should use a relatively complicated string and stored some ware.*/
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
	}
	
	@Bean
	public	static String randomPassword() {
		
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		
		while(salt.length() < 18){
			int index = (int)(rnd.nextFloat()*SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}		
		return salt.toString();
	}
	
	
} 