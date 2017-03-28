package com.rest.robert.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.rest.robert.web.models.User;
/**
 * 
 * @author Robert Jenifer Vilbert
 * Mar 27, 2017 12:05:38 AM 12:05:38 AM 
 * UserDaoImpl.java
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Save the user in the database.
	 */
	public void create(User user) {
		entityManager.persist(user);
		return;
	}

	/**
	 * Delete the user from the database.
	 */
	public void delete(User user) {
		if (entityManager.contains(user))
			entityManager.remove(user);
		else
			entityManager.remove(entityManager.merge(user));
		return;
	}

	/**
	 * Return all the users stored in the database.
	 */
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return entityManager.createQuery("from User").getResultList();
	}

	/**
	 * Return the user having the passed email.
	 */
	public User getByEmail(String email) {
		return (User) entityManager.createQuery("from User where email = :email").setParameter("email", email)
				.getSingleResult();
	}

	/**
	 * Return the user having the passed id.
	 */
	public User getById(long id) {
		return entityManager.find(User.class, id);
	}

	/**
	 * Update the passed user in the database.
	 */
	public void update(User user) {
		entityManager.merge(user);
		return;
	}
}
