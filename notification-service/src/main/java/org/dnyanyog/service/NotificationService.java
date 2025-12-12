package org.dnyanyog.service;

import org.dnyanyog.dto.LowStockRequest;
import org.dnyanyog.dto.RestockRequest;
import org.dnyanyog.dto.NotificationResponse;

public interface NotificationService {

    NotificationResponse sendLowStockAlert(LowStockRequest request);

    NotificationResponse sendRestockConfirmation(RestockRequest request);
}
