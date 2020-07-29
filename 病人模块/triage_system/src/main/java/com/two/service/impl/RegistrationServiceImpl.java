package com.two.service.impl;


import com.two.dao.RegistrationMapper;
import com.two.entity.Registration;
import com.two.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-19 14:42
 */
@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;

    @Override
    public List<Registration> getRegistrationList() {
        List<Registration> registrationList = null;
        try {
            registrationList = registrationMapper.getRegistrationList();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registrationList;
    }

    @Override
    public boolean addReg(Registration registration) {
        boolean flag=false;
        try{
            int updateRows =registrationMapper.addReg(registration);
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
    public Registration getRegistration(String regPatientName) {
Registration registration=null;

        try{
           registration=registrationMapper.getRegistration(regPatientName);
        }catch(Exception e){
            e.printStackTrace();
        }

        if(null==registration){
                registration=null;
        }
        return registration;
    }

    @Override
    public List<Registration> getDiagnosis(String regPatientName, String patientTel) {

        List<Registration> diagnosisList=null;
        try {
            diagnosisList = registrationMapper.getDiagnosis(regPatientName, patientTel);
        }catch(Exception e){
            e.printStackTrace();
        }
        return diagnosisList;
    }
}
