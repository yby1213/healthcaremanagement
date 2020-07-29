package com.two.service;

import com.two.entity.Clinic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClinicService {
    /**
     * 根据条件查询用户列表
     * @param queryName
     * @return
     */
    public List<Clinic> getClinicList(String queryName, int currentPageNo, int pageSize);
    /**
     * 根据条件查询用户表记录数
     * @param queryName
     * @return
     */
    public int getClinicCount(String queryName);
    /**
     * 增加用户信息
     * @param clinic
     * @return
     * @throws Exception
     */
    public boolean add(Clinic clinic) throws Exception;
    /**
     * 通过clinicNo获取clinic
     * @param clinicNo
     * @return
     * @throws Exception
     */
    public Clinic getClinicByNo(@Param("clinicNo")String clinicNo)throws Exception;
    /**
     * 修改用户信息
     * @param clinic
     * @return
     */
    public boolean modify(Clinic clinic);
    /**
     * 根据clinicNo删除clinic
     * @param clinicNo
     * @return
     */
    public boolean deleteClinicByNo(String clinicNo);
}
