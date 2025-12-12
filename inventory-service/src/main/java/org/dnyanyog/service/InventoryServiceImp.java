package org.dnyanyog.service;

import jakarta.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.dnyanyog.common.InventoryResponseCode;
import org.dnyanyog.dto.InventoryData;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.entity.Inventory;
import org.dnyanyog.repo.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InventoryServiceImp implements InventoryService
 {

  @Autowired
  private InventoryRepository inventoryRepo;

  @Override
  public InventoryResponse addInventory(@Valid InventoryRequest request) {
    InventoryResponse inventoryResponse = new InventoryResponse();

    try {
      Optional<Inventory> existingInventory = inventoryRepo.findByProductCode(request.getProductCode());
      if (existingInventory.isPresent()) {
        inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_ADD_FAILED.getStatus());
        inventoryResponse.setMessage("Inventory for this product code already exists.");
        return inventoryResponse;
      }

      Inventory newInventory = new Inventory();
      newInventory.setProductCode(request.getProductCode());
      newInventory.setQuantity(request.getQuantity());
      newInventory.setWarehouseLocation(request.getWarehouseLocation());
      newInventory.setStatus(request.getStatus());
      newInventory.setCreatedDate(LocalDateTime.now());
      newInventory.setUpdatedDate(LocalDateTime.now());

      inventoryRepo.save(newInventory);
      populateInventoryResponse(inventoryResponse, newInventory);
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_ADDED.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_ADDED.getMessage());
    } catch (Exception e) {
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_ADD_FAILED.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_ADD_FAILED.getMessage());
    }

    return inventoryResponse;
  }

  @Override
  public InventoryResponse updateInventory(String inventoryId, @Valid InventoryRequest request) {
    InventoryResponse inventoryResponse = new InventoryResponse();
    Optional<Inventory> optionalInventory = inventoryRepo.findById(Long.parseLong(inventoryId));

    if (optionalInventory.isEmpty()) {
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_UPDATE_FAILED.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_UPDATE_FAILED.getMessage());
    } else {
      Inventory inventory = optionalInventory.get();
      inventory.setProductCode(request.getProductCode());
      inventory.setQuantity(request.getQuantity());
      inventory.setWarehouseLocation(request.getWarehouseLocation());
      inventory.setStatus(request.getStatus());
      inventory.setUpdatedDate(LocalDateTime.now());

      inventoryRepo.save(inventory);
      populateInventoryResponse(inventoryResponse, inventory);
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_UPDATED.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_UPDATED.getMessage());
    }

    return inventoryResponse;
  }

  @Override
  public InventoryResponse getInventoryById(String inventoryId) {
    InventoryResponse inventoryResponse = new InventoryResponse();
    Optional<Inventory> optionalInventory = inventoryRepo.findById(Long.parseLong(inventoryId));

    if (optionalInventory.isEmpty()) {
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_NOT_FOUND.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_NOT_FOUND.getMessage());
    } else {
      populateInventoryResponse(inventoryResponse, optionalInventory.get());
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_FOUND.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_FOUND.getMessage());
    }

    return inventoryResponse;
  }
  private void populateInventoryResponse(InventoryResponse inventoryResponse, Inventory inventory) {
	    InventoryData data = new InventoryData();
	    data.setInventoryId(String.valueOf(inventory.getInventoryId()));
	    data.setProductCode(inventory.getProductCode());
	    data.setQuantity(inventory.getQuantity());
	    data.setWarehouseLocation(inventory.getWarehouseLocation());
	    data.setStatus(inventory.getStatus());
	    //data.setRestockDate(inventory.getRestockDate());
	    data.setCreatedDate(inventory.getCreatedDate());
	    data.setUpdatedDate(inventory.getUpdatedDate());

	    // ✅ Wrap single InventoryData in a list before setting
	    inventoryResponse.setData(Collections.singletonList(data));

	    // Optional: Set response code and message if needed
	    inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_FOUND.getStatus());
	    inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_FOUND.getMessage());
	}


@Override
  public InventoryResponse deleteInventory(String inventoryId) {
    InventoryResponse inventoryResponse = new InventoryResponse();
    Optional<Inventory> optionalInventory = inventoryRepo.findById(Long.parseLong(inventoryId));

    if (optionalInventory.isEmpty()) {
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_DELETE_FAILED.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_DELETE_FAILED.getMessage());
    } else {
      inventoryRepo.deleteById(Long.parseLong(inventoryId));
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_DELETED.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_DELETED.getMessage());
    }

    return inventoryResponse;
  }

  @Override
  public InventoryResponse getAllInventories() {
    InventoryResponse inventoryResponse = new InventoryResponse();
    List<Inventory> allInventories = inventoryRepo.findAll();

    if (allInventories.isEmpty()) {
      inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_NOT_FOUND.getStatus());
      inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_NOT_FOUND.getMessage());
      return inventoryResponse;
    }

    List<InventoryData> inventoryDataList = new ArrayList<>();
    for (Inventory inventory : allInventories) {
      InventoryData data = new InventoryData();
      data.setInventoryId(String.valueOf(inventory.getInventoryId()));
      data.setProductCode(inventory.getProductCode());
      data.setQuantity(inventory.getQuantity());
      data.setWarehouseLocation(inventory.getWarehouseLocation());
      data.setStatus(inventory.getStatus());
      //data.setRestockDate(inventory.getRestockDate());
      data.setCreatedDate(inventory.getCreatedDate());
      data.setUpdatedDate(inventory.getUpdatedDate());
      inventoryDataList.add(data);
    }

    inventoryResponse.setData(inventoryDataList); // ✅ FIXED
    inventoryResponse.setStatus(InventoryResponseCode.INVENTORY_FOUND.getStatus());
    inventoryResponse.setMessage(InventoryResponseCode.INVENTORY_FOUND.getMessage());

    return inventoryResponse;
  }


  
  @Override
  public InventoryResponse getInventoryByProductCode(String productCode) {
      InventoryResponse response = new InventoryResponse();

      Optional<Inventory> inventoryOpt = inventoryRepo.findByProductCode(productCode);

      if (inventoryOpt.isPresent()) {
          Inventory inventory = inventoryOpt.get();

          InventoryData data = new InventoryData();
          data.setInventoryId(String.valueOf(inventory.getInventoryId()));
          data.setProductCode(inventory.getProductCode());
          data.setQuantity(inventory.getQuantity());
          data.setWarehouseLocation(inventory.getWarehouseLocation());
          data.setStatus(inventory.getStatus());
          //data.setRestockDate(inventory.getRestockDate());
          data.setCreatedDate(inventory.getCreatedDate());
          data.setUpdatedDate(inventory.getUpdatedDate());

          // ✅ Fix: Wrap single InventoryData into a List
          response.setData(Collections.singletonList(data));

          response.setStatus(InventoryResponseCode.INVENTORY_FOUND.getStatus());
          response.setMessage(InventoryResponseCode.INVENTORY_FOUND.getMessage());
      } else {
          response.setStatus(InventoryResponseCode.INVENTORY_NOT_FOUND.getStatus());
          response.setMessage(InventoryResponseCode.INVENTORY_NOT_FOUND.getMessage());
          response.setData(Collections.emptyList()); // Optional: return empty list if not found
      }

      return response;
  }


}
