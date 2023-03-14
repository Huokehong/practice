package com.example.physical_examination.po;

import lombok.Data;

@Data
public class Orders {

    private Integer orderId;
    private String orderDate;
    private String userId;
    private Integer hpId;
    private Integer smId;
    private Integer state;
    //多对一
    private Setmeal setmeal;
    private Hospital hospital;
    private Users users;


}
