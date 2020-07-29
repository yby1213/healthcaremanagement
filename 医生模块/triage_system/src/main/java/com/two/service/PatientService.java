package com.two.service;

import com.two.entity.Clinic;
import com.two.entity.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientService {
    /**
     * 病人清单
     * @return
     */
    public List<Patient> getPatientList(String queryName, int currentPageNo, int pageSize);
    /**
     * 根据条件查询用户表记录数
     * @param queryName
     * @return
     */
    public int getPatientCount(String queryName);
    /**
     * 删除病人
     * @param patientNo
     * @return
     */
    public boolean deletePatientByNo(String patientNo);
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
     */
    public boolean modify(Patient patient);
    /**
     * 增加用户信息
     * @param patient
     * @return
     * @throws Exception
     */
    public boolean add(Patient patient) throws Exception;

}
