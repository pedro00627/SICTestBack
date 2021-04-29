package com.sic.sicTestBack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.sic.sicTestBack.config.UserLogin;
import com.sic.sicTestBack.service.UserServiceImpl;

@RestController
public class LoginController {
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/login")
	public ResponseEntity<?> addUser(@RequestBody UserLogin userLogin){
		try {
			UserDetails user = userService.loadUserByUsername(userLogin.getUsername());
			if (userLogin.getPassword().equals(user.getPassword()))
				return new ResponseEntity<>("ok", HttpStatus.OK);
				
			return new ResponseEntity<>("Wrong username or password", HttpStatus.UNAUTHORIZED);
		} catch (Exception e) {
			return new ResponseEntity<>(new Gson().toJson(e), HttpStatus.UNAUTHORIZED);
		}
		
	}

}
