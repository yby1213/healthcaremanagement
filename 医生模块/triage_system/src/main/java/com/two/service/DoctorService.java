package com.two.service;

import com.two.entity.Clinic;
import com.two.entity.Doctor;

import javax.print.Doc;
import java.util.List;

public interface DoctorService {
    /**
     * 医生登录
     * @param doctorTel
     * @param doctorPassword
     * @return Doctor
     */
    public Doctor login(String doctorTel, String doctorPassword);
    /**
     * 新增医生
     * @param doctor
     * @return
     */
    public boolean add(Doctor doctor);

    /**
     * 医生清单
     * @return
     */
    public List<Doctor> getDoctorList(String queryName, int currentPageNo, int pageSize);
    /**
     * 根据条件查询用户表记录数
     * @param queryName
     * @return
     */
    public int getDoctorCount(String queryName);
    /**
     * 根据条件查询用户表记录
     * @param doctorNo
     * @return
     */
    public Doctor getDoctorByNo(String doctorNo);
    /**
     * 修改用户信息
     * @param doctor
     * @return
     */
    public boolean modify(Doctor doctor);
    /**
     * 修改用户信息
     * @param doctorNo
     * @return
     */
    public boolean deleteDoctorByNo(String doctorNo);
}
