package com.example.orderservice.dto;

public class OrderRequest {
    private Long customerId;
    private Double totalAmount;

    public OrderRequest() {}
    public OrderRequest(Long customerId, Double totalAmount) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
    }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
} 