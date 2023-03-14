package com.example.physical_examination.po;

import lombok.Data;

@Data
public class Doctor {

    private Integer docId;
    private String docCode;
    private String realName;
    private String password;
    private Integer sex;
    private Integer deptno;

}
