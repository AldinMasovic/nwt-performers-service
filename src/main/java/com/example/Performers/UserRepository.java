package com.example.Performers;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author DT User
 */
public interface UserRepository extends
        CrudRepository<User, Long> {

    User findByUserId(Long id);
}