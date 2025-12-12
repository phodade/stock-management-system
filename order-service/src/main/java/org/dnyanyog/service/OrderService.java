package org.dnyanyog.service;

import jakarta.validation.Valid;
import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;

public interface OrderService {

    // Place a new order
    public OrderResponse placeOrder(@Valid OrderRequest request) throws Exception;

    // Cancel an existing order by ID
    public OrderResponse cancelOrder(String orderId);

    // Get order by ID
    public OrderResponse getOrderById(String orderId);

    // Get orders by customer name (optional extension)
    public OrderResponse getOrdersByCustomerName(String customerName);

    // Delete an order by ID
    public OrderResponse deleteOrder(String orderId);

    // Get all orders
    public OrderResponse getAllOrders();

}
