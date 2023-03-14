package com.example.physical_examination.service.impl;

import com.example.physical_examination.mapper.DoctorMapper;
import com.example.physical_examination.po.Doctor;
import com.example.physical_examination.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctorByCodeByPass(Doctor doctor) {
        return doctorMapper.getDoctorByCodeByPass(doctor);
    }
}
