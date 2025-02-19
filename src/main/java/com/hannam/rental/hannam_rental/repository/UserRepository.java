package com.hannam.rental.hannam_rental.repository;

import com.hannam.rental.hannam_rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
    Optional<User> findByPhoneNumber(String phoneNumber);
}
