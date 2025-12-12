package org.dnyanyog.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "suppliers")
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Supplier {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long supplierId;

  @NotBlank(message = "Supplier name is mandatory")
  @Size(min = 1, max = 100, message = "Supplier name must be between 1 and 100 characters")
  @Column(name = "supplier_name", nullable = false, length = 100)
  private String supplierName;

  @NotBlank(message = "Contact is mandatory")
  @Size(min = 5, max = 15, message = "Contact must be between 5 and 15 characters")
  @Column(nullable = false, length = 15)
  private String contact;

  @NotBlank(message = "Address is mandatory")
  @Size(max = 255, message = "Address must be at most 255 characters")
  @Column(nullable = false, length = 255)
  private String address;

  @Column(nullable = false)
  private boolean active;

public Long getSupplierId() {
	return supplierId;
}

public void setSupplierId(Long supplierId) {
	this.supplierId = supplierId;
}

public String getSupplierName() {
	return supplierName;
}

public void setSupplierName(String supplierName) {
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

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}
  
  
  
}
