package com.example.physical_examination.controller;

import com.example.physical_examination.po.Users;
import com.example.physical_examination.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
public class USersController {

    @Autowired
    private UsersService usersService;

//    登录
    @RequestMapping("/geyusers")
        public Users getUsersByIdAndPassWord(@RequestBody Users users){

        return usersService.getUsersByIdAndPassWord(users);
        }
}
