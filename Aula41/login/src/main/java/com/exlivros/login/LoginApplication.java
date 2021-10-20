package com.exlivros.login;

import net.minidev.json.JSONUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(scanBasePackages={"com.exlivros.login.model"},exclude = { SecurityAutoConfiguration.class })
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);


		//BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(16);
		//String result = bCryptPasswordEncoder.encode("admin");
		//System.out.println("My token " + result);
	}


}
