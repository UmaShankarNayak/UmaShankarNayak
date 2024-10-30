package com.softcoders.order.service;

import com.softcoders.order.dtos.PurchaseOrderRequestDto;
import com.softcoders.order.dtos.PurchaseOrderResponseDto;

public interface PurchaseOrderService {


    PurchaseOrderResponseDto processOrder(PurchaseOrderRequestDto purchaseOrderRequestDto);
}
