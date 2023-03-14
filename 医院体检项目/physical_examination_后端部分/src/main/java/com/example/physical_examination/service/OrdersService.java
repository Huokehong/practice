package com.example.physical_examination.service;

import com.example.physical_examination.dto.OrdersPageRequestDto;
import com.example.physical_examination.dto.OrdersPageResponseDto;
import com.example.physical_examination.po.Orders;

public interface OrdersService {

    public OrdersPageResponseDto listOrders(OrdersPageRequestDto request);

    public Orders getOrdersById(Integer orderId);

    public int updateOrdersState(Orders orders);
}
