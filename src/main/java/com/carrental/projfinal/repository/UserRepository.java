package com.carrental.projfinal.repository;

import com.carrental.projfinal.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
