package org.dnyanyog.controller;

import org.dnyanyog.dto.*;
import org.dnyanyog.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @PostMapping("/place")
  public OrderResponse placeOrder(@RequestBody OrderRequest request) throws Exception {
    return orderService.placeOrder(request);
  }

  @PostMapping("/cancel/{orderId}")
  public OrderResponse cancelOrder(@PathVariable String orderId) {
    return orderService.cancelOrder(orderId);
  }

  @GetMapping("/{orderId}")
  public OrderResponse getOrderById(@PathVariable String orderId) {
    return orderService.getOrderById(orderId);
  }

  @GetMapping("/all")
  public OrderResponse getAllOrders() {
    return orderService.getAllOrders();
  }
}
