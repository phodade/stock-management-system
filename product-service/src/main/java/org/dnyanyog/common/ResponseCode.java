package org.dnyanyog.common;

public enum ResponseCode {

  PRODUCT_ADDED("Success", "Product added successfully!"),
  PRODUCT_ADD_FAILED("Fail", "Failed to add product!"),

  PRODUCT_UPDATED("Success", "Product updated successfully!"),
  PRODUCT_UPDATE_FAILED("Fail", "Failed to update product!"),

  PRODUCT_FOUND("Success", "Product retrieved successfully!"),
  PRODUCT_NOT_FOUND("Fail", "Product not found!"),

  PRODUCT_DELETED("Success", "Product deleted successfully!"),
  PRODUCT_DELETE_FAILED("Fail", "Failed to delete product!");

  private final String status;
  private final String message;

  ResponseCode(String status, String message) {
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
