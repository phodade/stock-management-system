package org.dnyanyog.common;

public enum OrderResponseCode {

  ORDER_PLACED("Success", "Order placed successfully!"),
  ORDER_PLACE_FAILED("Fail", "Failed to place order!"),

  ORDER_UPDATED("Success", "Order updated successfully!"),
  ORDER_UPDATE_FAILED("Fail", "Failed to update order!"),

  ORDER_CANCELLED("Success", "Order cancelled successfully!"),
  ORDER_CANCEL_FAILED("Fail", "Failed to cancel order!"),

  ORDER_FOUND("Success", "Order retrieved successfully!"),
  ORDER_NOT_FOUND("Fail", "Order not found!"),

  ORDER_LIST_FETCHED("Success", "All orders fetched successfully!"),
  ORDER_LIST_FETCH_FAILED("Fail", "Failed to fetch order list!");

  private final String status;
  private final String message;

  OrderResponseCode(String status, String message) {
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
