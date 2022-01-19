package com.user.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.user.user.models.UserStockBalance;
import com.user.user.repository.UserStockBalanceRepository;

@RestController
public class UserStockBalanceController {

    @Autowired
    private UserStockBalanceRepository userStockBalanceRepository;
    
    public List<UserStockBalance> listar() {
        return userStockBalanceRepository.findAll();
    }

}
