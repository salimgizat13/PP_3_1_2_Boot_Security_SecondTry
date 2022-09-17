package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.UserT;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserT, Integer> {
    Optional<UserT> findByUsername(String username);
}
