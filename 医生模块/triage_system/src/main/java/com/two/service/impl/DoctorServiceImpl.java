package com.two.service.impl;

import com.two.dao.DoctorMapper;
import com.two.entity.Doctor;
import com.two.service.DoctorService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.print.Doc;
import java.util.List;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private DoctorMapper doctorMapper;

    @Override
    public Doctor login(String doctorTel, String doctorPassword) {
        // TODO Auto-generated method stub
        Doctor doctor = null;
        try {
            doctor = doctorMapper.getLoginDoc(doctorTel);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //匹配密码
        if(null != doctor){
            if(!doctor.getDoctorPassword().equals(doctorPassword))
                doctor = null;
        }

        return doctor;
    }

    @Override
    public boolean add(Doctor doctor) {
        boolean flag=false;
        try{
            int updFlag = doctorMapper.add(doctor);
            if(updFlag>0){
                flag = true;
                System.out.println("添加新医生成功");
            }else{
                System.out.println("添加新医生失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Doctor> getDoctorList(String queryName, int currentPageNo, int pageSize) {
        List<Doctor> doctorList = null;
        try{
            doctorList = doctorMapper.getDoctorList(queryName,(currentPageNo-1)*pageSize,pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public int getDoctorCount(String queryName) {
        // TODO Auto-generated method stub
        int count = 0;
        try {
            count = doctorMapper.getDoctorCount(queryName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public Doctor getDoctorByNo(String doctorNo) {
        Doctor doctor = null;
        try {
            doctor = doctorMapper.getDoctorByNo(doctorNo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return doctor;
    }

    @Override
    public boolean modify(Doctor doctor) {
        // TODO Auto-generated method stub
        boolean flag = false;
        System.out.println("modify"+doctor);
        try {
            if(doctorMapper.modify(doctor) > 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteDoctorByNo(String doctorNo) {
        boolean flag = false;
        try {
            if(doctorMapper.deleteDoctorByNo(doctorNo) > 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }
}
