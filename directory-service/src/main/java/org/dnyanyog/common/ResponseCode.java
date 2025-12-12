package org.dnyanyog.common;

public enum ResponseCode {
  LOGIN_SUCCESS("Success", "User Login successful"),
  LOGIN_FAIL("Fail", "User Login failed"),
  USER_ADDED("Success", "User added successfully"),
  USER_FAILED("Fail", "Failed to add User"),
  SAME_USERNAME_EMAIL("Fail", "User already exists"),
  USER_NOT_UPDATED("Fail", "User not found"),
  USER_UPDATED("Success", "User updated successfully"),
  SEARCH_USER("Success", "User found successfully"),
  SEARCH_USER_FAILED("Fail", "User not found"),
  NOT_DELETE_USER("Fail", "User not deleted"),
  DELETE_USER("Success", "User deleted successfully");


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