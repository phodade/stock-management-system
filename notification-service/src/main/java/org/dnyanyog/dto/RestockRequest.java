package org.dnyanyog.dto;

import lombok.Data;

@Data
public class RestockRequest {
  private String productName;
  private int restockedQuantity;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getRestockedQuantity() {
	return restockedQuantity;
}
public void setRestockedQuantity(int restockedQuantity) {
	this.restockedQuantity = restockedQuantity;
}
  
  
}
