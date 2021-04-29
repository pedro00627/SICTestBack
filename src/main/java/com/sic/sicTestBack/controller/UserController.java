/**
 * 
 */
package com.sic.sicTestBack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.sic.sicTestBack.model.UserModel;
import com.sic.sicTestBack.service.UserServiceImpl;
import com.sic.sicTestBack.utils.Converter;

/**
 * @author pedro
 *
 */
@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/user")
	public ResponseEntity<?> addUser(@RequestBody UserModel userModel){
		try {
			userService.create(Converter.userModelConverter(userModel));
			return new ResponseEntity<>("ok", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new Gson().toJson(e), HttpStatus.NOT_FOUND);
		}
		
	}
	
}
