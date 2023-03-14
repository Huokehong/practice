package com.example.physical_examination.controller;

import com.example.physical_examination.po.Doctor;
import com.example.physical_examination.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/getDoctorByCodeByPass")
    public Doctor getDoctorByCodeByPass(@RequestBody Doctor doctor) {
        return doctorService.getDoctorByCodeByPass(doctor);
    }
}
