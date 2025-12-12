package org.dnyanyog.service;

import jakarta.validation.Valid;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;

public interface InventoryService {

    public InventoryResponse addInventory(@Valid InventoryRequest request) throws Exception;

    public InventoryResponse updateInventory(String inventoryId, @Valid InventoryRequest request);

    public InventoryResponse getInventoryById(String inventoryId);

    public InventoryResponse getInventoryByProductCode(String productCode);

    public InventoryResponse deleteInventory(String inventoryId);

    public InventoryResponse getAllInventories();
    
    
    

    }


