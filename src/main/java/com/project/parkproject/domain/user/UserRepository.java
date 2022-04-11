package com.project.parkproject.domain.user;

import java.util.Optional;
import com.project.parkproject.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findBygId(String gId);
    Optional<Users> save(User user);
}