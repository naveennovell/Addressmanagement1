package com.cg.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDaoI {
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(User user) {
		em.persist(user);
		
	}

}
