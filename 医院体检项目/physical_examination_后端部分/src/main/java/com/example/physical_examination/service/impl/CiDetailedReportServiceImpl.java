package com.example.physical_examination.service.impl;

import com.example.physical_examination.mapper.CiDetailedReportMapper;
import com.example.physical_examination.po.CiDetailedReport;
import com.example.physical_examination.service.CiDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiDetailedReportServiceImpl implements CiDetailedReportService {

    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;

    @Override
    public int updateCiDetailedReport(List<CiDetailedReport> list) {
        return ciDetailedReportMapper.updateCiDetailedReport(list);
    }
}
