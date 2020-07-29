package com.two.service.impl;

import com.two.entity.Patient;
import com.two.entity.Registration;
import com.two.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 14:47
 */
@Service("patientService")
public class PatientServiceImpl implements PatientService {
    @Resource
    private com.two.dao.PatientMapper patientMapper;

    @Override
    public boolean add(Patient patient) {
        boolean flag=false;
        try{
            int updateRows =patientMapper.add(patient);
            if(updateRows > 0){
                flag = true;
                System.out.println("add success!");
            }else{
                System.out.println("add failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Patient getRegistration(String patientName) {
        Patient patient=null;

        try{
            patient=patientMapper.getRegistration(patientName);

        }catch(Exception e){
            e.printStackTrace();
        }

        if(null==patient){
            patient=null;
        }
        return patient;
    }
}
