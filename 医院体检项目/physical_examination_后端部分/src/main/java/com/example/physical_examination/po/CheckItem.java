package com.example.physical_examination.po;

import lombok.Data;

import java.util.List;

@Data
public class CheckItem {

    private Integer ciId;
    private String ciName;
    private String ciContent;
    private String meaning;
    private String remarks;
    //一对多
    private List<CheckItemDetailed> cdList;


}
