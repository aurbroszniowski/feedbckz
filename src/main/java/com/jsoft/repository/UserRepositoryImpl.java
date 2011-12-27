package com.jsoft.repository;

import org.neo4j.graphdb.traversal.TraversalDescription;
import org.neo4j.helpers.collection.ClosableIterable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.jsoft.domain.entities.User;

/**
 * Made by aurbrsz / 12/27/11 - 17:15
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
  @Override
  public User save(final User user) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Iterable<User> save(final Iterable<? extends User> users) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public User findOne(final Long aLong) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public boolean exists(final Long aLong) {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public ClosableIterable<User> findAll() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public long count() {
    return 0;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void delete(final Long aLong) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void delete(final User user) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void delete(final Iterable<? extends User> users) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void deleteAll() {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public ClosableIterable<User> findAll(final Sort orders) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public Page<User> findAll(final Pageable pageable) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public User findByPropertyValue(final String s, final Object o) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public ClosableIterable<User> findAllByPropertyValue(final String s, final Object o) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public ClosableIterable<User> findAllByQuery(final String s, final Object o) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public ClosableIterable<User> findAllByRange(final String s, final Number number, final Number number1) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public <N> Iterable<User> findAllByTraversal(final N n, final TraversalDescription traversalDescription) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }
}
