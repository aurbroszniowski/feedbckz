package com.jsoft.services;

import org.neo4j.helpers.collection.ClosableIterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.domain.entities.User;
import com.jsoft.repository.UserRepository;

/**
 * Made by aurbrsz / 12/26/11 - 22:50
 */
@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired UserRepository userRepository;

  @Override
  @Transactional
  public void saveUser(final String pseudo, final String email, final String password) {
    //TODO : where do we do the validation?
    User newUser = new User();
    newUser.setPseudo(pseudo);
    newUser.setEmail(email);
    newUser.setPassword(password);
    userRepository.save(newUser);
  }

  @Override
  public User findUserByPseudo(final String pseudo) {
    return userRepository.findByPropertyValue("pseudo", pseudo);
  }

  @Override
  public Iterable<User> findAllUsers() {
    return userRepository.findAll();
  }

}
