package com.example.Uber.Repository;

import com.example.Uber.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByName(String name);
}