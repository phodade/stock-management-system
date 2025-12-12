package org.dnyanyog.common;

public enum SupplierResponseCode {

  SUPPLIER_ADDED("Success", "Supplier added successfully!"),
  SUPPLIER_ADD_FAILED("Fail", "Failed to add supplier!"),

  SUPPLIER_FOUND("Success", "Supplier retrieved successfully!"),
  SUPPLIER_NOT_FOUND("Fail", "Supplier not found!"),

  SUPPLIER_DELETED("Success", "Supplier deleted successfully!"),
  SUPPLIER_DELETE_FAILED("Fail", "Failed to delete supplier!"),

  SUPPLIER_UPDATED("Success", "Supplier updated successfully!"),
  SUPPLIER_UPDATE_FAILED("Fail", "Failed to update supplier!"),

  RESTOCK_INITIATED("Success", "Restocking initiated from supplier!"),
  RESTOCK_FAILED("Fail", "Failed to restock from supplier!");

  private final String status;
  private final String message;

  SupplierResponseCode(String status, String message) {
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
