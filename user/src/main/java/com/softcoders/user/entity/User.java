package com.softcoders.user.entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
@Table(name = "users")
public class User {

    @Id
    private Integer id;
    private String name;
    private Integer balance;

}
