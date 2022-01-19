package com.user.user.repository;

import com.user.user.models.UserStockBalance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStockBalanceRepository extends JpaRepository<UserStockBalance, Long> {
}
