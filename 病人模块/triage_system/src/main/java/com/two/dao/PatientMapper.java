package com.two.dao;

import com.two.entity.Patient;
import com.two.entity.Registration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 14:33
 */
@Repository
@Mapper
public interface PatientMapper {
    //患者预约信息
    public int add(Patient patient)throws Exception;
//根据患者名查信息
    public Patient getRegistration(@Param("patientName")String patientName);


}
