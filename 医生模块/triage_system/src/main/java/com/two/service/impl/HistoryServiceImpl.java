package com.two.service.impl;

import com.two.dao.HistoryMapper;
import com.two.entity.History;
import com.two.service.HistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {
    @Resource
    private HistoryMapper historyMapper;

    @Override
    public boolean add(History history) throws Exception {
        boolean flag=false;
        try{
            int updFlag = historyMapper.add(history);
            if(updFlag>0){
                flag = true;
                System.out.println("添加新历史成功");
            }else{
                System.out.println("添加新历史失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<History> getHistoryByName(String patientName) throws Exception {
        List<History> historyList = null;
        try{
            historyList = historyMapper.getHistoryByName(patientName);
        }catch (Exception e){
            e.printStackTrace();
        }
        return historyList;
    }
}
