package com.softcoders.order.controller;

import com.softcoders.order.dtos.PurchaseOrderRequestDto;
import com.softcoders.order.dtos.PurchaseOrderResponseDto;
import com.softcoders.order.serviceImpl.PurchaseOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.softcoders.order.utils.OrderServiceCons.ROOT_ORDER_PURCHASE_URL;

@RestController
@RequestMapping(ROOT_ORDER_PURCHASE_URL)
public class PurchaseOrderController {


    @Autowired
    private PurchaseOrderServiceImpl purchaseOrderService;

    @PostMapping
    public ResponseEntity<PurchaseOrderResponseDto> processOrder(@RequestBody PurchaseOrderRequestDto purchaseOrderRequestDto) {
        return ResponseEntity.ok(purchaseOrderService.processOrder(purchaseOrderRequestDto));
    }

}
