package com.two.dao;

import com.two.entity.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HistoryMapper {
    /**
     * 新入会医生入口
     * @param history
     * @return
     * @throws Exception
     */
    public int add(History history)throws Exception;
    /**
     * 新入会医生入口
     * @param patientName
     * @return
     * @throws Exception
     */
    public List<History> getHistoryByName(@Param("patientName")String patientName)throws Exception;
}
