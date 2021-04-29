package com.sic.sicTestBack.service;

import java.util.List;

import com.sic.sicTestBack.entities.User;
import com.sic.sicTestBack.model.UserModel;


public interface UserService {
	
	public boolean create(User user);
	
	public User read(Long id);
	
	public List<UserModel> readAll();
	
	public void update(User user);
	
	public void delete(Long id);
	
}
