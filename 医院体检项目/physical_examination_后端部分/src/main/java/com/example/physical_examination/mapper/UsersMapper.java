package com.example.physical_examination.mapper;

import com.example.physical_examination.po.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {

    @Select("select * from users where userId=#{userId}")
    public Users getUsersById(String userId);
}
