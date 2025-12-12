package org.dnyanyog.service;

import jakarta.validation.Valid;
import org.dnyanyog.common.OrderResponseCode;
import org.dnyanyog.dto.OrderData;
import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;
import org.dnyanyog.entity.Order;
import org.dnyanyog.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Override
    public OrderResponse placeOrder(@Valid OrderRequest request) {
        OrderResponse response = new OrderResponse();
        try {
            Order order = new Order();
            order.setCustomerName(request.getCustomerName());
            order.setProductName(request.getProductName());
            order.setQuantity(request.getQuantity());
            order.setStatus("PLACED");
            order.setOrderDate(new Date());

            Order savedOrder = orderRepo.save(order);

            response.setStatus(OrderResponseCode.ORDER_PLACED.getStatus());
            response.setMessage(OrderResponseCode.ORDER_PLACED.getMessage());
            response.setData(Collections.singletonList(convertToData(savedOrder)));
        } catch (Exception e) {
            response.setStatus(OrderResponseCode.ORDER_PLACE_FAILED.getStatus());
            response.setMessage(OrderResponseCode.ORDER_PLACE_FAILED.getMessage());
        }
        return response;
    }

    @Override
    public OrderResponse cancelOrder(String orderId) {
        OrderResponse response = new OrderResponse();
        Optional<Order> optionalOrder = orderRepo.findByOrderId(Long.parseLong(orderId));

        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setStatus("CANCELLED");
            orderRepo.save(order);

            response.setStatus(OrderResponseCode.ORDER_CANCELLED.getStatus());
            response.setMessage(OrderResponseCode.ORDER_CANCELLED.getMessage());
            response.setData(Collections.singletonList(convertToData(order)));
        } else {
            response.setStatus(OrderResponseCode.ORDER_CANCEL_FAILED.getStatus());
            response.setMessage(OrderResponseCode.ORDER_CANCEL_FAILED.getMessage());
        }

        return response;
    }

    @Override
    public OrderResponse getOrderById(String orderId) {
        OrderResponse response = new OrderResponse();
        Optional<Order> optionalOrder = orderRepo.findByOrderId(Long.parseLong(orderId));

        if (optionalOrder.isPresent()) {
            response.setStatus(OrderResponseCode.ORDER_FOUND.getStatus());
            response.setMessage(OrderResponseCode.ORDER_FOUND.getMessage());
            response.setData(Collections.singletonList(convertToData(optionalOrder.get())));
        } else {
            response.setStatus(OrderResponseCode.ORDER_NOT_FOUND.getStatus());
            response.setMessage(OrderResponseCode.ORDER_NOT_FOUND.getMessage());
        }

        return response;
    }

    @Override
    public OrderResponse deleteOrder(String orderId) {
        OrderResponse response = new OrderResponse();
        Optional<Order> optionalOrder = orderRepo.findByOrderId(Long.parseLong(orderId));

        if (optionalOrder.isPresent()) {
            orderRepo.deleteById(optionalOrder.get().getOrderId());
            response.setStatus("Success");
            response.setMessage("Order deleted successfully!");
        } else {
            response.setStatus("Fail");
            response.setMessage("Order not found. Deletion failed.");
        }

        return response;
    }

    @Override
    public OrderResponse getAllOrders() {
        OrderResponse response = new OrderResponse();
        List<Order> orders = orderRepo.findAll();

        if (orders.isEmpty()) {
            response.setStatus(OrderResponseCode.ORDER_NOT_FOUND.getStatus());
            response.setMessage(OrderResponseCode.ORDER_NOT_FOUND.getMessage());
            response.setData(Collections.emptyList());
            return response;
        }

        List<OrderData> orderDataList = new ArrayList<>();
        for (Order order : orders) {
            orderDataList.add(convertToData(order));
        }

        response.setStatus(OrderResponseCode.ORDER_LIST_FETCHED.getStatus());
        response.setMessage(OrderResponseCode.ORDER_LIST_FETCHED.getMessage());
        response.setData(orderDataList);

        return response;
    }

    @Override
    public OrderResponse getOrdersByCustomerName(String customerName) {
        OrderResponse response = new OrderResponse();
        List<Order> orders = orderRepo.findByCustomerName(customerName);

        if (orders.isEmpty()) {
            response.setStatus(OrderResponseCode.ORDER_NOT_FOUND.getStatus());
            response.setMessage(OrderResponseCode.ORDER_NOT_FOUND.getMessage());
            response.setData(Collections.emptyList());
            return response;
        }

        List<OrderData> orderDataList = new ArrayList<>();
        for (Order order : orders) {
            orderDataList.add(convertToData(order));
        }

        response.setStatus(OrderResponseCode.ORDER_FOUND.getStatus());
        response.setMessage(OrderResponseCode.ORDER_FOUND.getMessage());
        response.setData(orderDataList);

        return response;
    }

    public OrderResponse updateOrder(Long orderId, @Valid OrderRequest request) {
        OrderResponse response = new OrderResponse();
        Optional<Order> optionalOrder = orderRepo.findByOrderId(orderId);

        if (optionalOrder.isEmpty()) {
            response.setStatus(OrderResponseCode.ORDER_UPDATE_FAILED.getStatus());
            response.setMessage(OrderResponseCode.ORDER_UPDATE_FAILED.getMessage());
            return response;
        }

        Order order = optionalOrder.get();
        order.setCustomerName(request.getCustomerName());
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setOrderDate(new Date());

        orderRepo.save(order);

        response.setStatus(OrderResponseCode.ORDER_UPDATED.getStatus());
        response.setMessage(OrderResponseCode.ORDER_UPDATED.getMessage());
        response.setData(Collections.singletonList(convertToData(order)));

        return response;
    }

    private OrderData convertToData(Order order) {
        OrderData data = new OrderData();
        data.setOrderId(order.getOrderId());
        data.setCustomerName(order.getCustomerName());
        data.setProductName(order.getProductName());
        data.setQuantity(order.getQuantity());
        data.setStatus(order.getStatus());
        data.setOrderDate(order.getOrderDate());
        return data;
    }
}
