package com.softcoders.user.controller;

import com.softcoders.user.dtos.TransactionRequestDto;
import com.softcoders.user.dtos.TransactionResponseDto;
import com.softcoders.user.entity.UserTransaction;
import com.softcoders.user.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/transaction")
public class UserTransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionResponseDto> createTransaction(@RequestBody TransactionRequestDto transactionRequestDto ){
        return ResponseEntity.ok(this.transactionService.createTransaction(transactionRequestDto));
    }

    @GetMapping
    public ResponseEntity<UserTransaction> getByUserId(@RequestParam("userId") int userId){
        return ResponseEntity.ok(this.transactionService.getByUserId(userId));
    }

}
