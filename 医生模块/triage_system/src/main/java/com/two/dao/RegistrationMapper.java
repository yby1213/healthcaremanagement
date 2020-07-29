package com.two.dao;

import com.two.entity.Clinic;
import com.two.entity.Registration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RegistrationMapper {
    /**
     * 通过条件查询-registrationList
     * @param regName
     * @return
     * @throws Exception
     */
    public List<Registration> getRegistrationList(@Param("regName")String regName, @Param("currentPageNo")int currentPageNo, @Param("pageSize") int pageSize)throws Exception;
    /**
     * 通过条件查询-用户表记录数
     * @param regName
     * @return
     * @throws Exception
     */
    public int getRegistrationCount(@Param("regName")String regName)throws Exception;
    /**
     * 通过regNo获取registration
     * @param regNo
     * @return
     * @throws Exception
     */
    public Registration getRegistrationByNo(@Param("regNo")String regNo)throws Exception;
    /**
     * 增加用户信息
     * @param registration
     * @return
     * @throws Exception
     */
    public int add(Registration registration);
    /**
     * 修改用户信息
     * @param registration
     * @return
     * @throws Exception
     */
    public int modify(Registration registration)throws Exception;
    /**
     * 通过regNo删除registration
     * @param regNo
     * @return
     * @throws Exception
     */
    public int deleteRegistrationByNo(String regNo)throws Exception;
}
