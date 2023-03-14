package com.example.physical_examination.mapper;

import com.neusoft.tijiancms.po.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HospitalMapper {

    @Select("select * from hospital where hpId=#{hpId}")
    public Hospital getHospitalById(Integer hpId);
}
