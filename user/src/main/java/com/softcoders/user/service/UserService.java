package com.softcoders.user.service;


import com.softcoders.user.dtos.UserDto;
import com.softcoders.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //TODO implements all the methods for User Controller
}
