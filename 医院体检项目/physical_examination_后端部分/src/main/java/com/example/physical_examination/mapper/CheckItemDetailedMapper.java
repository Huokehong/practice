package com.example.physical_examination.mapper;

import com.example.physical_examination.po.CheckItemDetailed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CheckItemDetailedMapper {

    @Select("select * from checkItemDetailed where ciId=#{ciId} order by cdId")
    public List<CheckItemDetailed> listCheckItemDetailed(Integer ciId);
}
