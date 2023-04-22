package com.chenwendy.service;

import com.chenwendy.dto.CreateOderRequest;
import com.chenwendy.dto.OrderQueryParams;
import com.chenwendy.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOderRequest createOderRequest);
}
