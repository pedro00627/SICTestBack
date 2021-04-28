package com.sic.sicTestBack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sic.sicTestBack.entities.User;
import com.sic.sicTestBack.model.UserModel;
import com.sic.sicTestBack.repository.UserRepository;
import com.sic.sicTestBack.utils.Converter;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void create(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User read(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public List<UserModel> readAll() {
		return Converter.userListConverter(userRepository.findAll());
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}


}
