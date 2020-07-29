package com.two.dao;

import com.two.entity.Clinic;
import com.two.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 20:52
 */
@Repository
@Mapper
public interface DoctorMapper {
    //获取所有科室
    public List<Doctor> getDoctorList();
    //根据科室名来查找医生
    public List<Doctor> getClinicDoc(@Param("doctorBel") String doctorBel);
}
