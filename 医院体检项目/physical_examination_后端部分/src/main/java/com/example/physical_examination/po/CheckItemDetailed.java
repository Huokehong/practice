package com.example.physical_examination.po;

import lombok.Data;

@Data
public class CheckItemDetailed {

    private Integer cdId;
    private String name;
    private String unit;
    private double minrange;
    private double maxrange;
    private String normalValue;
    private String normalValueString;
    private Integer type;
    private Integer ciId;
    private String remarks;


}
