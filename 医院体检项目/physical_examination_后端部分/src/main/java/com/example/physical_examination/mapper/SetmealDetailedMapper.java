package com.example.physical_examination.mapper;

import com.example.physical_examination.po.SetmealDetailed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDetailedMapper {

    public List<SetmealDetailed> listSetmealDetailedBySmId(Integer smId);
}
