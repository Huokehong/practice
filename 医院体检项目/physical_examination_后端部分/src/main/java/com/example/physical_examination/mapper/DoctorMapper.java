package com.example.physical_examination.mapper;

import com.example.physical_examination.po.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoctorMapper {

    @Select("select * from doctor where docCode=#{docCode} and password=#{password}")
    public Doctor getDoctorByCodeByPass(Doctor doctor);
}
