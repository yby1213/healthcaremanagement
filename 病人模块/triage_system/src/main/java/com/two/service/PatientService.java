package com.two.service;

import com.two.entity.Patient;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 14:47
 */
public interface PatientService {
    public boolean add(Patient patient);
    public Patient getRegistration(String patientName);
}
