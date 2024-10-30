package com.softcoders.user.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@ToString
public class UserTransaction {

    @Id
    private Integer id;

    //TODO add many to one relationship
    private Integer userId;
    private Integer amount;
    private LocalDateTime transactionDate;

}
