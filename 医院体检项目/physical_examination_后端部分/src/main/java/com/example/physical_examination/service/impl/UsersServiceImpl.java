package com.example.physical_examination.service.impl;

import com.example.physical_examination.mapper.UsersMapper;
import com.example.physical_examination.po.Users;
import com.example.physical_examination.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getUsersByIdAndPassWord(Users users) {
        return null;
    }
}
