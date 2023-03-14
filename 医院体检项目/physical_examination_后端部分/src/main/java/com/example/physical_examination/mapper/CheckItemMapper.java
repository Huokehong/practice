package com.example.physical_examination.mapper;

import com.example.physical_examination.po.CheckItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckItemMapper {

    public CheckItem getCheckItemById(Integer ciId);
}
