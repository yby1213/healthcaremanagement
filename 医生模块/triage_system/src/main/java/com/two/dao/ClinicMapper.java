package com.two.dao;

import com.two.entity.Clinic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface ClinicMapper {
    /**
     * 通过条件查询-clinicList
     * @param clinicName
     * @return
     * @throws Exception
     */
    public List<Clinic> getClinicList(@Param("clinicName")String clinicName, @Param("currentPageNo")int currentPageNo, @Param("pageSize") int pageSize)throws Exception;
    /**
     * 通过条件查询-用户表记录数
     * @param clinicName
     * @return
     * @throws Exception
     */
    public int getClinicCount(@Param("clinicName")String clinicName)throws Exception;
    /**
     * 增加用户信息
     * @param clinic
     * @return
     * @throws Exception
     */
    public int add(Clinic clinic);
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
     * @throws Exception
     */
    public int modify(Clinic clinic)throws Exception;
    /**
     * 通过clinicNo删除clinic
     * @param clinicNo
     * @return
     * @throws Exception
     */
    public int deleteClinicByNo(@Param("clinicNo")String clinicNo)throws Exception;
}
