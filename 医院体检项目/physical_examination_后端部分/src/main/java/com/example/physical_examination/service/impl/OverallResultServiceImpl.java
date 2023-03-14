package com.example.physical_examination.service.impl;

import com.example.physical_examination.mapper.OverallResultMapper;
import com.example.physical_examination.po.OverallResult;
import com.example.physical_examination.service.OverallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OverallResultServiceImpl implements OverallResultService {

    @Autowired
    private OverallResultMapper overallResultMapper;

    @Override
    public List<OverallResult> listOverallResultByOrderId(Integer orderId) {
        return overallResultMapper.listOverallResultByOrderId(orderId);
    }

    @Override
    public int removeOverallResult(Integer orId) {
        return overallResultMapper.removeOverallResult(orId);
    }

    @Override
    public int saveOverallResult(OverallResult overallResult) {
        return overallResultMapper.saveOverallResult(overallResult);
    }

    @Override
    public int updateOverallResult(OverallResult overallResult) {
        return overallResultMapper.updateOverallResult(overallResult);
    }
}
