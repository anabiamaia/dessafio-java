package com.stock.stock.controller;

import com.stock.stock.models.Stock;
import com.stock.stock.repository.StockRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping
    public List<Stock> Listar() {
        return stockRepository.findAll();
    }

    @PostMapping
    public Stock adicionar(@RequestBody Stock stock) {
        return stockRepository.save(stock);
    }
}
