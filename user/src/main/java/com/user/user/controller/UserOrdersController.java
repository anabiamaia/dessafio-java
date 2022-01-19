package com.user.user.controller;

import com.user.user.repository.UserOrdersRepository;
import com.user.user.models.UserOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserOrdersController {

    @Autowired
    private UserOrdersRepository userOrdersRepository;

    @GetMapping("/orders")
    public List<UserOrders> listar() {
        return userOrdersRepository.findAll();
    }
}
