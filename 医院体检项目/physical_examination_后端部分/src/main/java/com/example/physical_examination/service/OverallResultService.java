package com.example.physical_examination.service;

import com.example.physical_examination.po.OverallResult;

import java.util.List;

public interface OverallResultService {

    public List<OverallResult> listOverallResultByOrderId(Integer orderId);

    public int saveOverallResult(OverallResult overallResult);

    public int updateOverallResult(OverallResult overallResult);

    public int removeOverallResult(Integer orId);
}
