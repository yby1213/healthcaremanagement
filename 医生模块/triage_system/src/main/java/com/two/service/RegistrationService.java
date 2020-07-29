package com.two.service;

import com.two.entity.Registration;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegistrationService {
    /**
     * 根据条件查询用户列表
     * @param queryName
     * @return
     */
    public List<Registration> getRegistrationList(String queryName, int currentPageNo, int pageSize);
    /**
     * 根据条件查询用户表记录数
     * @param queryName
     * @return
     */
    public int getRegistrationCount(String queryName);
    /**
     * 通过regNo获取registration
     * @param regNo
     * @return
     * @throws Exception
     */
    public Registration getRegistrationByNo(@Param("regNo")String regNo)throws Exception;
    /* *
     * 增加用户信息
     * @param registration
     * @return
     * @throws Exception*/
    public boolean add(Registration registration) throws Exception;
    /**
     * 修改用户信息
     * @param registration
     * @return
     */
    public boolean modify(Registration registration);
    /**
     * 根据regNo删除registration
     * @param regNo
     * @return
     */
    public boolean deleteRegistrationByNo(String regNo);
}
