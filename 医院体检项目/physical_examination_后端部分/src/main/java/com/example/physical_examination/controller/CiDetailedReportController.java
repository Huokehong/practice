package com.example.physical_examination.controller;

import com.example.physical_examination.po.CiDetailedReport;
import com.example.physical_examination.service.CiDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciDetailedReport")
public class CiDetailedReportController {

    @Autowired
    private CiDetailedReportService ciDetailedReportService;

    @RequestMapping("/updateCiDetailedReport")
    public int updateCiDetailedReport(@RequestBody List<CiDetailedReport> list) {
        return ciDetailedReportService.updateCiDetailedReport(list);
    }
}
