package com.example.physical_examination.po;

import lombok.Data;

@Data
public class Users {

    private String userId;
    private String password;
    private String realName;
    private Integer sex;
    private String identityCard;
    private String birthday;
    private Integer userType;


}
