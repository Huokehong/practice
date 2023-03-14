package com.example.physical_examination.service;



import com.example.physical_examination.po.CiReport;
import com.example.physical_examination.po.Orders;

import java.util.List;

public interface CiReportService {

    public int createReportTemplate(Orders orders);

    public List<CiReport> listCiReport(Integer orderId);
}
