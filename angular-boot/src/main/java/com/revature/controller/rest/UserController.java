package com.revature.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.User;
import com.revature.projection.UserNoPassword;

@RestController
@RequestMapping("/user")
public class UserController {


	@GetMapping
	public List<User> getAllUsers() {
		return null;
	}

	@GetMapping("projection")
	public List<UserNoPassword> getAllUsersProjection() {
		return null;
	}
}
