package com.jsoft.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.domain.entities.User;

/**
 * Made by aurbrsz / 12/26/11 - 22:50
 */

public interface UserService {

  @Transactional
  void saveUser(final String pseudo, final String email, final String password);

  User findUserByPseudo(String pseudo);

  Iterable<User> findAllUsers();

}
