package com.two.controller;

import com.two.entity.Clinic;
import com.two.entity.Doctor;
import com.two.service.DoctorService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-21 17:03
 */
@Controller
public class DoctorController {
    private Logger logger = Logger.getLogger(PatientController.class);
    @Resource
    private DoctorService doctorService;

    //查找doctor表中门诊的名字
    @RequestMapping("getDoctorList")
    @ResponseBody
    public List<Doctor> getDoctorList(Map<String,Object> map) {
        List<Doctor> doctorList = doctorService.getDoctorList();
        System.out.println(doctorList);
        return doctorList;
    }

//根据门诊的名字找到对应医生的名字
    @RequestMapping("getClinicDocList")
    @ResponseBody
    public List<Doctor> getClinicDocList(String docName) {
        System.out.println("选择的医生编号是"+docName);
        List<Doctor> clinicDoc = doctorService.getClinicDoc(docName);
        System.out.println("查找出来的医生是"+clinicDoc);
        return clinicDoc;
    }
}
