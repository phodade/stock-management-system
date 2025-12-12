package org.dnyanyog.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "orders")
public class Order {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;

  @NotBlank(message = "Customer name is mandatory")
  @Size(min = 2, max = 100, message = "Customer name must be between 2 and 100 characters")
  private String customerName;

  @NotBlank(message = "Product name is mandatory")
  @Size(min = 2, max = 100, message = "Product name must be between 2 and 100 characters")
  private String productName;

  @Min(value = 1, message = "Quantity must be at least 1")
  private int quantity;

  @NotBlank(message = "Status is required")
  private String status;

  @PastOrPresent(message = "Order date cannot be in the future")
  private Date orderDate;

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }
}
