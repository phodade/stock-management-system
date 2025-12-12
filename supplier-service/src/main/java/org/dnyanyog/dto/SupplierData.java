package org.dnyanyog.dto;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class SupplierData {

  @NotBlank(message = "Supplier name is mandatory")
  @Size(min = 1, max = 100, message = "Supplier name must be between 1 and 100 characters")
  private String supplierName;

  @NotBlank(message = "Contact is mandatory")
  @Size(min = 5, max = 15, message = "Contact must be between 5 and 15 characters")
  private String contact;

  @NotBlank(message = "Address is mandatory")
  @Size(max = 255, message = "Address must be at most 255 characters")
  private String address;

public String getsupplierName() {
	return supplierName;
}

public void setsupplierName(String supplierName) {
	this.supplierName = supplierName;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
  
  
}
