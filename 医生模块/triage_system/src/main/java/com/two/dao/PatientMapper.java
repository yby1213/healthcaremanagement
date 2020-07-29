package com.two.dao;

import com.two.entity.Clinic;
import com.two.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PatientMapper {
    /**
     * 得到病人列表
     * @return
     * @throws Exception
     */
    public List<Patient> getPatientList(@Param("patientName")String patientName, @Param("currentPageNo")int currentPageNo, @Param("pageSize") int pageSize)throws Exception;
    /**
     * 通过条件查询-用户表记录数
     * @param patientName
     * @return
     * @throws Exception
     */
    public int getPatientCount(@Param("patientName")String patientName)throws Exception;
    /**
     * 通过名字删除病人
     * @param patientNo
     * @return
     * @throws Exception
     */
    public int deletePatientByNo(String patientNo)throws Exception;
    /**
     * 通过patientNo获取patient
     * @param patientNo
     * @return
     * @throws Exception
     */
    public Patient getPatientByNo(@Param("patientNo")String patientNo)throws Exception;
    /**
     * 修改用户信息
     * @param patient
     * @return
     * @throws Exception
     */
    public int modify(Patient patient)throws Exception;
    /**
     * 增加用户信息
     * @param patient
     * @return
     * @throws Exception
     */
    public int add(Patient patient);
}
