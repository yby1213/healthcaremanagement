package com.two.dao;

import com.two.entity.Patient;
import com.two.entity.Registration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-19 14:31
 */
@Repository
@Mapper
public interface RegistrationMapper {
//获取所有患者信息
    public List<Registration> getRegistrationList();
//预约功能个
    public int addReg(Registration registration)throws Exception;

    //判断registration表中的患者名和patient表中名字有无一样的
    public Registration getRegistration(@Param("regPatientName")String regPatientName);
    //根据患者的姓名和电话来查寻医生的就诊情况
    public List<Registration> getDiagnosis(@Param("regPatientName")String regPatientName,@Param("patientTel")String patientTel);

}
