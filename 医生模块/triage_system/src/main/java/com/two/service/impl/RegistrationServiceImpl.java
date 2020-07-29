package com.two.service.impl;

import com.two.dao.ClinicMapper;
import com.two.dao.RegistrationMapper;
import com.two.entity.Clinic;
import com.two.entity.Registration;
import com.two.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;

    @Override
    public List<Registration> getRegistrationList(String queryName, int currentPageNo, int pageSize) {
        // TODO Auto-generated method stub
        List<Registration> registrationList = null;
        try {
            registrationList = registrationMapper.getRegistrationList(queryName,(currentPageNo-1)*pageSize,pageSize);
            System.out.println(queryName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registrationList;
    }

    @Override
    public int getRegistrationCount(String queryName) {
        // TODO Auto-generated method stub
        int count = 0;
        try {
            count = registrationMapper.getRegistrationCount(queryName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public Registration getRegistrationByNo(String regNo) throws Exception {
        // TODO Auto-generated method stub
        Registration registration = null;
        try{
            registration = registrationMapper.getRegistrationByNo(regNo);
            System.out.println("getRegistrationByNo"+registration);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            registration = null;
        }
        return registration;
    }
    @Override
    public boolean add(Registration registration) throws Exception {
        boolean flag = false;
        if(registrationMapper.add(registration)>0)
            flag= true;
        return flag;
    }

    @Override
    public boolean modify(Registration registration) {
        boolean flag = false;
        System.out.println("modify");
        System.out.println("modify");
        System.out.println("modify");
        System.out.println("modify");
        System.out.println("modify");
        try{
            if(registrationMapper.modify(registration)>0){
                flag = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteRegistrationByNo(String regNo) {
        boolean flag = false;
        try{
            if(registrationMapper.deleteRegistrationByNo(regNo)>0)
                flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
