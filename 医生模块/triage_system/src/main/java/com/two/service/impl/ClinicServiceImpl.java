package com.two.service.impl;

import com.two.dao.ClinicMapper;
import com.two.entity.Clinic;
import com.two.service.ClinicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("clinicService")
public class ClinicServiceImpl implements ClinicService {

    @Resource
    private ClinicMapper clinicMapper;

    @Override
    public List<Clinic> getClinicList(String queryName, int currentPageNo, int pageSize) {
        // TODO Auto-generated method stub
        List<Clinic> clinicList = null;
        try {
            clinicList = clinicMapper.getClinicList(queryName,(currentPageNo-1)*pageSize,pageSize);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return clinicList;
    }

    @Override
    public int getClinicCount(String queryName) {
        // TODO Auto-generated method stub
        int count = 0;
        try {
            count = clinicMapper.getClinicCount(queryName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public boolean add(Clinic clinic) {
        // TODO Auto-generated method stub

        boolean flag = false;
        try {
            int updateRows = clinicMapper.add(clinic);
            if(updateRows > 0){
                flag = true;
                System.out.println("add success!");
            }else{
                System.out.println("add failed!");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Clinic getClinicByNo(String clinicNo) throws Exception {
        // TODO Auto-generated method stub
        Clinic clinic = null;
        try{
            clinic = clinicMapper.getClinicByNo(clinicNo);
            System.out.println("getClinicByNo"+clinic);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            clinic = null;
        }
        return clinic;
    }

    @Override
    public boolean modify(Clinic clinic) {
        // TODO Auto-generated method stub
        boolean flag = false;
        System.out.println("modify"+clinic);
        try {
            if(clinicMapper.modify(clinic) > 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteClinicByNo(String clinicNo) {
        // TODO Auto-generated method stub
        boolean flag = false;
        try {
            if(clinicMapper.deleteClinicByNo(clinicNo) > 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(clinicNo);
        return flag;
    }
}
