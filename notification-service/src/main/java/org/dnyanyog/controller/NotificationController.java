package org.dnyanyog.controller;

import org.dnyanyog.dto.*;
import org.dnyanyog.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notify")
public class NotificationController {

  @Autowired
  private NotificationService service;

  @PostMapping("/low-stock")
  public NotificationResponse lowStockAlert(@RequestBody LowStockRequest request) {
    return service.sendLowStockAlert(request);
  }

  @PostMapping("/restock")
  public NotificationResponse restockConfirm(@RequestBody RestockRequest request) {
    return service.sendRestockConfirmation(request);
  }
}
