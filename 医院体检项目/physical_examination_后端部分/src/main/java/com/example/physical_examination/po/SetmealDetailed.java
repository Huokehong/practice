package com.example.physical_examination.po;

import lombok.Data;

@Data
public class SetmealDetailed {

    private Integer sdId;
    private Integer smId;
    private Integer ciId;
    //多对一
    private CheckItem checkItem;


}
