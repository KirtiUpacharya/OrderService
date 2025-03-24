package com.example.orderservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Long customerId;
    private Double totalAmount;
    private String status;

    public Order() {}
    public Order(Long customerId, Double totalAmount, String status) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
} 