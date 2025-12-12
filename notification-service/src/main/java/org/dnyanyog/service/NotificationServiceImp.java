package org.dnyanyog.service;

import java.time.LocalDateTime;

import org.dnyanyog.common.NotificationResponseCode;
import org.dnyanyog.dto.LowStockRequest;
import org.dnyanyog.dto.NotificationResponse;
import org.dnyanyog.dto.RestockRequest;
import org.dnyanyog.entity.Notification;
import org.dnyanyog.repo.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImp implements NotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    @Override
    public NotificationResponse sendLowStockAlert(LowStockRequest request) {
        System.out.println("Sending low stock alert for product: " + request.getProductName());

        // Create entity and save to DB
        Notification notification = new Notification();
        notification.setProductName(request.getProductName());
        notification.setNotificationType("LOW_STOCK");
        notification.setMessage("Low stock alert: " + request.getAvailableQuantity() + " left.");
        notification.setTimestamp(LocalDateTime.now());
        notificationRepo.save(notification);

        // Return response
        NotificationResponse response = new NotificationResponse();
        response.setStatus(NotificationResponseCode.LOW_STOCK_ALERT_SENT.getStatus());
        response.setMessage(NotificationResponseCode.LOW_STOCK_ALERT_SENT.getMessage());
        return response;
    }

    @Override
    public NotificationResponse sendRestockConfirmation(RestockRequest request) {
        System.out.println("Sending restock confirmation for product: " + request.getProductName());

        // Create entity and save to DB
        Notification notification = new Notification();
        notification.setProductName(request.getProductName());
        notification.setNotificationType("RESTOCKED");
        notification.setMessage("Restocked with quantity: " + request.getRestockedQuantity());
        notification.setTimestamp(LocalDateTime.now());
        notificationRepo.save(notification);

        // Return response
        NotificationResponse response = new NotificationResponse();
        response.setStatus(NotificationResponseCode.RESTOCK_CONFIRMATION_SENT.getStatus());
        response.setMessage(NotificationResponseCode.RESTOCK_CONFIRMATION_SENT.getMessage());
        return response;
    }
}
