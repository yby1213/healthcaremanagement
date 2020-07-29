package com.two.service;

import com.two.entity.History;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryService {
    /**
     * 增加用户信息
     * @param history
     * @return
     * @throws Exception
     */
    public boolean add(History history) throws Exception;
    /**
     * 新入会医生入口
     * @param patientName
     * @return
     * @throws Exception
     */
    public List<History> getHistoryByName(String patientName)throws Exception;
}
