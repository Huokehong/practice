package com.example.physical_examination.po;

import lombok.Data;


@Data
public class Setmeal {

    private Integer smId;
    private String name;
    private Integer type;
    private Integer price;
    //一对多
    private SetmealDetailed sdList;

}


