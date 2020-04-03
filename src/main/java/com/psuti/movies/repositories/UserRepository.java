package com.psuti.movies.repositories;

import com.psuti.movies.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
