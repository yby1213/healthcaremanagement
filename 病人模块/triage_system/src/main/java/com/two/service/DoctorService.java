package com.two.service;

import com.two.entity.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 20:59
 */
public interface DoctorService {
    public List<Doctor> getDoctorList();
    public List<Doctor> getClinicDoc(String doctorBel);
}
