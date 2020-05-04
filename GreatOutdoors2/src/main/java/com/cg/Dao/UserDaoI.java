package com.cg.Dao;

import org.springframework.stereotype.Repository;

import com.cg.entity.User;

@Repository
public interface UserDaoI {
	public void create(User user);

}
