package com.example.physical_examination.service.impl;

import com.example.physical_examination.mapper.CiDetailedReportMapper;
import com.example.physical_examination.mapper.CiReportMapper;
import com.example.physical_examination.mapper.SetmealMapper;
import com.example.physical_examination.po.*;
import com.example.physical_examination.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiReportServiceImpl implements CiReportService {

    @Autowired
    private CiReportMapper ciReportMapper;
    @Autowired
    private SetmealMapper setmealMapper;
    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;

    @Transactional
    @Override
    public int createReportTemplate(Orders orders) {
        //1、检查当前预约编号对应的体检报告是否已经生成
        int count = ciReportMapper.getCiReportByOrderId(orders.getOrderId());
        if (count > 0) {
            return 1;
        }

        //2、查询报告模板（从CheckItem、CheckItemDetailed查询检查项和检查项明细）
        Setmeal setmeal = setmealMapper.getSetmealById(orders.getSmId());


        //3、根据查询出的信息，先向CiReport中插入报告检查项模板
        List<CiReport> cirList = new ArrayList<>();
        for (SetmealDetailed sd : setmeal.getSdList()) {
            CiReport cir = new CiReport();
            cir.setCiId(sd.getCheckItem().getCiId());
            cir.setCiName(sd.getCheckItem().getCiName());
            cir.setOrderId(orders.getOrderId());
            cirList.add(cir);
        }
        int result1 = ciReportMapper.saveCiReport(cirList);

        //4、根据查询出的信息，向CiDetailedReport中插入报告检查项明细模板
        List<CiDetailedReport> cidrList = new ArrayList<>();
        for (SetmealDetailed sd : setmeal.getSdList()) {
            for (CheckItemDetailed cid : sd.getCheckItem().getCdList()) {
                CiDetailedReport cidr = new CiDetailedReport();
                cidr.setName(cid.getName());
                cidr.setUnit(cid.getUnit());
                cidr.setMinrange(cid.getMinrange());
                cidr.setMaxrange(cid.getMaxrange());
                cidr.setNormalValue(cid.getNormalValue());
                cidr.setNormalValueString(cid.getNormalValueString());
                cidr.setType(cid.getType());
                cidr.setValue("");
                cidr.setIsError(0);
                cidr.setCiId(sd.getCiId());
                cidr.setOrderId(orders.getOrderId());
                cidrList.add(cidr);
            }
        }
        int result2 = ciDetailedReportMapper.saveCiDetailedReport(cidrList);

        return result1 > 0 && result2 > 0 ? 1 : 0;
    }

    @Override
    public List<CiReport> listCiReport(Integer orderId) {
        //先查询CiReport表，获取体检报告中的检查项
        List<CiReport> cirList = ciReportMapper.listCiReport(orderId);

        //根据上面查询获取的检查项，再查询检查项明细（CiDetailedReport）
        for (CiReport cir : cirList) {
            CiDetailedReport param = new CiDetailedReport();
            param.setOrderId(orderId);
            param.setCiId(cir.getCiId());
            List<CiDetailedReport> list = ciDetailedReportMapper.listCiDetailedReportByOrderIdByCiId(param);
            cir.setCidrList(list);
        }

        return cirList;
    }
}
