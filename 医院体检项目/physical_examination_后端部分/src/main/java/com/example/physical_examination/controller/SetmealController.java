package com.example.physical_examination.controller;

import com.example.physical_examination.po.Setmeal;
import com.example.physical_examination.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {

    @Autowired
    private SetmealService setmealService;

    @RequestMapping("/listSetmeal")
    public List<Setmeal> listSetmeal() {
        return setmealService.listSetmeal();
    }
}
