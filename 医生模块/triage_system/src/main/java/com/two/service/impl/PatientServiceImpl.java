package com.two.service.impl;

import com.two.dao.PatientMapper;
import com.two.entity.Clinic;
import com.two.entity.Patient;
import com.two.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("patientService")
public class PatientServiceImpl implements PatientService {

    @Resource
    private PatientMapper patientMapper;

    @Override
    public List<Patient> getPatientList(String queryName, int currentPageNo, int pageSize) {
        List<Patient> patientList = null;
        try{
            patientList = patientMapper.getPatientList(queryName,(currentPageNo-1)*pageSize,pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }
        return patientList;
    }

    @Override
    public int getPatientCount(String queryName) {
        // TODO Auto-generated method stub
        int count = 0;
        try {
            count = patientMapper.getPatientCount(queryName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public boolean deletePatientByNo(String patientNo) {
        boolean flag = false;
        try{
            if(patientMapper.deletePatientByNo(patientNo)>0)
                flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Patient getPatientByNo(String patientNo) throws Exception {
        // TODO Auto-generated method stub
        Patient patient = null;
        try{
            patient = patientMapper.getPatientByNo(patientNo);
            System.out.println("getPatientByNo"+patient);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            patient = null;
        }
        return patient;
    }

    @Override
    public boolean modify(Patient patient) {
        // TODO Auto-generated method stub
        boolean flag = false;
        System.out.println("modify"+patient);
        try {
            if(patientMapper.modify(patient) > 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean add(Patient patient) throws Exception {
        // TODO Auto-generated method stub

        boolean flag = false;
        try {
            int updateRows = patientMapper.add(patient);
            if(updateRows > 0){
                flag = true;
                System.out.println("patient add success!");
            }else{
                System.out.println("patient add failed!");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }
}
