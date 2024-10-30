package com.softcoders.user.service;


import com.softcoders.user.dtos.TransactionRequestDto;
import com.softcoders.user.dtos.TransactionResponseDto;
import com.softcoders.user.dtos.TransactionStatus;
import com.softcoders.user.entity.UserTransaction;
import com.softcoders.user.repository.UserRepository;
import com.softcoders.user.repository.UserTransactionRepository;
import com.softcoders.user.utils.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserTransactionRepository transactionRepository;

    public TransactionResponseDto createTransaction(final TransactionRequestDto requestDto){
       //TODO
        UserTransaction userTransaction = transactionRepository.findByUserId(requestDto.getUserId());

        //TODO check amount and do other operation

        //TODO amount < from requested amount return exception

        //TODO Amount > from requested amount update amount
        userRepository.updateUserBalance(requestDto.getUserId(), requestDto.getAmount());

        //TODO return transaction response


        return null;
    }

    public UserTransaction getByUserId(int userId){
        return this.transactionRepository.findByUserId(userId);
    }

}
