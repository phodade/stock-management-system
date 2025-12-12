package org.dnyanyog.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class InventoryData {

    @NotBlank(message = "Inventory ID is mandatory")
    private String inventoryId;

    @NotBlank(message = "Product code is mandatory")
    @Size(min = 1, max = 50, message = "Product code must be between 1 and 50 characters")
    private String productCode;

    @NotNull(message = "Quantity is required")
    @Min(value = 0, message = "Quantity must be zero or positive")
    private Integer quantity;

    @NotBlank(message = "Warehouse location is mandatory")
    @Size(max = 100, message = "Warehouse location must not exceed 100 characters")
    private String warehouseLocation;

    @NotBlank(message = "Status is mandatory")
    @Size(max = 30, message = "Status must not exceed 30 characters")
    private String status;

    private LocalDate restockDate;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getWarehouseLocation() {
		return warehouseLocation;
	}

	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getRestockDate() {
		return restockDate;
	}

	public void setRestockDate(LocalDate restockDate) {
		this.restockDate = restockDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

    
}
