package com.example.marriageux.controller;

import com.example.marriageux.dto.UserDto;
import com.example.marriageux.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
@RequiredArgsConstructor
public class UserController {

   private  final UserService userService;

   @PostMapping(path = "/create")
   public void  createUser(@RequestBody UserDto user){
       userService.createUser(user);
   }




}
