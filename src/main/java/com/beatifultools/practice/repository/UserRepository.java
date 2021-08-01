package com.beatifultools.practice.repository;

import org.springframework.data.repository.CrudRepository;

import com.beatifultools.practice.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
