package com.rest.robert.web.dao;

import com.rest.robert.web.models.User;
/**
 * 
 * @author Robert Jenifer Vilbert
 * Mar 27, 2017 12:05:20 AM 12:05:20 AM 
 * UserDao.java
 */
public interface UserDao {

	public User getById(long id);

	public void update(User user);

	public User getByEmail(String email);

	public void delete(User user);

	public void create(User user);

}
