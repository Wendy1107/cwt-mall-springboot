package com.chenwendy.service;

import com.chenwendy.dto.CreateOderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOderRequest createOderRequest);
}
