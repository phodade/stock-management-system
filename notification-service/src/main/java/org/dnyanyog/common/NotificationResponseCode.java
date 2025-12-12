package org.dnyanyog.common;

public enum NotificationResponseCode {

    LOW_STOCK_ALERT_SENT("200", "Low stock alert sent successfully"),
    RESTOCK_CONFIRMATION_SENT("200", "Restock confirmation sent successfully"),
    INVALID_REQUEST("400", "Invalid request data"),
    ERROR_SENDING_NOTIFICATION("500", "Failed to send notification");

    private final String status;
    private final String message;

    NotificationResponseCode(String status, String message) {
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
