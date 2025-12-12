package org.dnyanyog.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Entity
@Component
@Table(name = "product")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_code", nullable = false, updatable = false)
  private long productCode;

  @Column(name = "product_id", nullable = false, updatable = false, unique = true)
  private String productId;

  @Column(name = "product_name", nullable = false, length = 100)
  private String productName;

  @Column(name = "description", length = 255)
  private String description;

  @Column(name = "price", nullable = false)
  private Double price;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "category", nullable = false)
  private String category;

  public enum Status {
    ACTIVE,
    OUT_OF_STOCK,
    DELETED
  }

  @Enumerated(EnumType.STRING)
  @Column(name = "status", nullable = false)
  private Status status;

  // Getters and Setters

  public long getProductCode() {
    return productCode;
  }

  public void setProductCode(long productCode) {
    this.productCode = productCode;
  }

  public String getproductId() {
    return productId;
  }

  public void setproductId(String productId) {
    this.productId = productId;
  }

  public String getproductName() {
    return productName;
  }

  public void setproductName(String productName) {
    this.productName = productName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getcategory() {
    return category;
  }

  public void setcategory(String category) {
    this.category = category;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  // Helper to generate Product ID
  private String generateRandomAlphanumeric(int length) {
    return UUID.randomUUID().toString().replace("-", "").substring(0, length).toUpperCase();
  }

  public void generateProductId() {
    this.productId = "PRD" + generateRandomAlphanumeric(8);
  }
}
