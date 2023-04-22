package com.chenwendy.service;

import com.chenwendy.dto.CreateOderRequest;
import com.chenwendy.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOderRequest createOderRequest);
}
