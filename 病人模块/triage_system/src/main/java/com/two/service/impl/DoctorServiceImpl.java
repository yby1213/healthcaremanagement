package com.two.service.impl;

import com.two.dao.DoctorMapper;
import com.two.entity.Doctor;
import com.two.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 21:00
 */
@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> getDoctorList() {
        List<Doctor> doctorList = null;
        try {
            doctorList = doctorMapper.getDoctorList();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> getClinicDoc(String doctorBel) {
        return doctorMapper.getClinicDoc(doctorBel);
    }
}

