package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
public class InventoryRequest {

    @NotBlank(message = "Product code is mandatory")
    @Size(min = 1, max = 50, message = "Product code must be between 1 and 50 characters")
    private String productCode;

    @NotNull(message = "Quantity is required")
    @Min(value = 0, message = "Quantity cannot be negative")
    private Integer quantity;

    @NotBlank(message = "Warehouse location is mandatory")
    @Size(max = 100, message = "Warehouse location must not exceed 100 characters")
    private String warehouseLocation;

    @NotBlank(message = "Status is mandatory")
    @Size(max = 30, message = "Status must not exceed 30 characters")
    private String status;

    
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
}
