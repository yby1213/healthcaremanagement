package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.two.entity.History;
import com.two.service.HistoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HistoryController {

    @Resource
    private HistoryService historyService;

    @RequestMapping("historyAdd")
    @ResponseBody
    public String historyAdd(@RequestParam("patientName")String patientName, @RequestParam("historyDate") String historyDate, @RequestParam("historyDiagnosis")String historyDiagnosis) {
        History history = new History();
        Map<String,String> map = new HashMap<String,String>();
        try {
            System.out.println("patientName "+patientName);
            System.out.println("historyDate "+historyDate);
            System.out.println("historyDiagnosis "+historyDiagnosis);
            history.setPatientName(patientName);
            history.setHistoryDate(historyDate);
            history.setHistoryDiagnosis(historyDiagnosis);
            System.out.println(history);
            if(historyService.add(history)) {
                map.put("addResult","true");
            }else{
                map.put("delResult","false");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
}
