package com.user.user.repository;

import com.user.user.models.UserOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOrdersRepository extends JpaRepository<UserOrders, Long> {

}
