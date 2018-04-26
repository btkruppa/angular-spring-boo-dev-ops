package com.revature.service;

import java.util.List;

import com.revature.entity.User;
import com.revature.projection.UserNoPassword;

public interface UserService {

	public List<User> getAllUsers();

	public List<UserNoPassword> getAllUsersProjection();

}
