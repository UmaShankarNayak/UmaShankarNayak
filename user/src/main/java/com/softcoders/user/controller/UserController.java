package com.softcoders.user.controller;


import com.softcoders.user.dtos.UserDto;
import com.softcoders.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("all")
    public ResponseEntity<UserDto> getAll() {
        return null;
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody Mono<UserDto> userDtoMono) {
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Integer id) {
        //TODO
        return null;
    }

    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable int id, @RequestBody Mono<UserDto> userDtoMono){
        //TODO
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
        return null;
    }

}
