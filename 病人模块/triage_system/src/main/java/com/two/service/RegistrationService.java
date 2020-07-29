package com.two.service;


import com.two.entity.Registration;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-19 14:40
 */
public interface RegistrationService {
    public List<Registration> getRegistrationList();

    public boolean addReg(Registration registration);
    public Registration getRegistration(String regPatientName);

    public List<Registration> getDiagnosis(String regPatientName, String patientTel);

}
