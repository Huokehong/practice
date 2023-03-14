package com.example.physical_examination.service.impl;

import com.example.physical_examination.mapper.SetmealMapper;
import com.example.physical_examination.po.Setmeal;
import com.example.physical_examination.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealMapper setmealMapper;

    @Override
    public List<Setmeal> listSetmeal() {
        return setmealMapper.listSetmeal();
    }
}
