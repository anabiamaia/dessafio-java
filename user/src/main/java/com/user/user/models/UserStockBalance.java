package com.user.user.models;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@IdClass(UserStockBalance.class)
@Table(name = "user_stock_balance")
public class UserStockBalance implements Serializable {
    @Id
    private Long id_stock;
    private String stock_symbol;
    private String stock_name;
    private Long volume;
    private Timestamp created_on;
    private Timestamp updated_on;
    @ManyToOne
    @JoinColumn(name = "id_user")
    @Id
    private User user;
    public Long getId_stock() {
        return id_stock;
    }
    public void setId_stock(Long id_stock) {
        this.id_stock = id_stock;
    }
    public String getStock_symbol() {
        return stock_symbol;
    }
    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }
    public String getStock_name() {
        return stock_name;
    }
    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }
    public Long getVolume() {
        return volume;
    }
    public void setVolume(Long volume) {
        this.volume = volume;
    }
    public Timestamp getCreated_on() {
        return created_on;
    }
    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }
    public Timestamp getUpdated_on() {
        return updated_on;
    }
    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
