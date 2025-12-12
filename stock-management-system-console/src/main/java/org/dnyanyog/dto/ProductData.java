package org.dnyanyog.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class ProductData {

  @NotNull(message = "Product ID is mandatory")
  private String  productId;

  @NotBlank(message = "Product name is mandatory")
  @Size(max = 100, message = "Product name should not exceed 100 characters")
  private String productName;

  @Size(max = 255, message = "Description should not exceed 255 characters")
  private String description;

  @NotNull(message = "Price is mandatory")
  @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
  private Double price;

  @NotNull(message = "Quantity is mandatory")
  @Min(value = 0, message = "Quantity must be zero or positive")
  private Integer quantity;
  
  @NotBlank(message = "Category is mandatory")
  @Size(max = 50, message = "Category should not exceed 50 characters")
  private String category;

  

  public String getcategory() {
	return category;
}

public void setcategory(String category) {
	this.category = category;
}

public String  getproductId() {
    return productId;
  }

  public void setproductId(String  productId) {
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
}
