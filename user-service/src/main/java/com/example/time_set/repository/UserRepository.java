package com.example.time_set.repository;

import com.example.time_set.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для {@link User}
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
