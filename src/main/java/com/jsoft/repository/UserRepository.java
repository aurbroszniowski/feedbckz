package com.jsoft.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.jsoft.domain.entities.User;

/**
 * Neo4J Repository
 * Made by aurbrsz / 12/26/11 - 23:56
 */

public interface UserRepository extends GraphRepository<User> { }
