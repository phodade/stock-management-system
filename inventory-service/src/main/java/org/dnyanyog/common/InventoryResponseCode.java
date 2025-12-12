package org.dnyanyog.common;

public enum InventoryResponseCode {

  INVENTORY_ADDED("Success", "Inventory added successfully!"),
  INVENTORY_ADD_FAILED("Fail", "Failed to add inventory!"),

  INVENTORY_UPDATED("Success", "Inventory updated successfully!"),
  INVENTORY_UPDATE_FAILED("Fail", "Failed to update inventory!"),

  INVENTORY_FOUND("Success", "Inventory retrieved successfully!"),
  INVENTORY_NOT_FOUND("Fail", "Inventory not found!"),

  INVENTORY_DELETED("Success", "Inventory deleted successfully!"),
  INVENTORY_DELETE_FAILED("Fail", "Failed to delete inventory!");

  private final String status;
  private final String message;

  InventoryResponseCode(String status, String message) {
    this.status = status;
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
