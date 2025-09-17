package com.devlyn.service;

import com.devlyn.domain.model.User;

public interface UserService {

	User findById(Long id);
	User create(User userToCreate);
}
