package com.two.dao;

import com.two.entity.Clinic;
import com.two.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DoctorMapper {
    /**
     * 医生登录
     * @param doctorTel
     * @return Doctor
     */
    public Doctor getLoginDoc(@Param("doctorTel") String doctorTel);

    /**
     * 新入会医生入口
     * @param doctor
     * @return
     * @throws Exception
     */
    public int add(Doctor doctor)throws Exception;
    /**
     * 得到医生列表
     * @return
     * @throws Exception
     */
    public List<Doctor> getDoctorList(@Param("doctorName")String doctorName, @Param("currentPageNo")int currentPageNo, @Param("pageSize") int pageSize)throws Exception;
    /**
     * 通过条件查询-用户表记录数
     * @param doctorName
     * @return
     * @throws Exception
     */
    public int getDoctorCount(@Param("doctorName")String doctorName)throws Exception;
    /**
     * 通过条件查询-用户表记录数
     * @param doctorNo
     * @return
     * @throws Exception
     */
    public Doctor getDoctorByNo(@Param("doctorNo")String doctorNo)throws Exception;
    /**
     * 修改用户信息
     * @param doctor
     * @return
     * @throws Exception
     */
    public int modify(Doctor doctor)throws Exception;
    /**
     * 修改用户信息
     * @param doctor
     * @return
     * @throws Exception
     */
    public int deleteDoctorByNo(@Param("doctorNo")String doctorNo)throws Exception;
}
