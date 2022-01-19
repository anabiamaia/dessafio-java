package com.user.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.user.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
