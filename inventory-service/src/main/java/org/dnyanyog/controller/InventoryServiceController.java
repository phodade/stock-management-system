package org.dnyanyog.controller;

import jakarta.validation.Valid;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryServiceController {

    @Autowired
    private InventoryService inventoryService;

   
    @PostMapping(path = "/add", consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
    public InventoryResponse addInventory(@Valid @RequestBody InventoryRequest request) throws Exception {
        return inventoryService.addInventory(request);
    }

    @PutMapping(path = "/update/{inventoryId}", consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
    public InventoryResponse updateInventory(@PathVariable String inventoryId, @Valid @RequestBody InventoryRequest request) {
        return inventoryService.updateInventory(inventoryId, request);
    }

 
    @GetMapping(path = "/{inventoryId}", produces = {"application/json", "application/xml"})
    public InventoryResponse getInventoryById(@PathVariable String inventoryId) {
        return inventoryService.getInventoryById(inventoryId);
    }

    @DeleteMapping(path = "/delete/{inventoryId}", produces = {"application/json", "application/xml"})
    public InventoryResponse deleteInventory(@PathVariable String inventoryId) {
        return inventoryService.deleteInventory(inventoryId);
    }

    
    @GetMapping(path = "/all", produces = {"application/json", "application/xml"})
    public InventoryResponse getAllInventory() {
        return inventoryService.getAllInventories();
    }
}
