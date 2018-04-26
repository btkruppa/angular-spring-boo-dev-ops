package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.User;
import com.revature.projection.UserNoPassword;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	List<UserNoPassword> findAllProjectedBy();
}
