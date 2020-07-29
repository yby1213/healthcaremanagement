package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.two.entity.Clinic;
import com.two.entity.Doctor;
import com.two.entity.History;
import com.two.entity.Patient;
import com.two.service.HistoryService;
import com.two.service.PatientService;
import com.two.tools.Constants;
import com.two.tools.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PatientController {

    @Resource
    private PatientService patientService;

    @Resource
    private HistoryService historyService;

    @RequestMapping("patientAdd")
    public String patientAdd() {
        return "patient/patientAdd";
    }

    @RequestMapping("patientMod")
    public String patientMod() {
        return "patient/patientMod";
    }

    @RequestMapping("patientList")
    public String patientList(Model model, @RequestParam(value = "queryname", required = false) String queryname,
                              @RequestParam(value = "pageIndex", required = false) String pageIndex,HttpSession session) {
        List<Patient> patientList = null;
        int pageSize = Constants.pageSize;

        int currentPageNo = 1;
        if (pageIndex != null && pageIndex != "") {
            currentPageNo = Integer.parseInt(pageIndex);
        }

        int totalCount = patientService.getPatientCount(queryname);

        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);

        patientList = patientService.getPatientList(queryname, currentPageNo, pageSize);

        model.addAttribute("pages", pages);
        model.addAttribute("patientList", patientList);
        return "patient/patientList";
    }

    @RequestMapping("patientInfo")
    public String patientInfo() {
        return "patient/patientInfo";
    }

    @RequestMapping("patientDel")
    @ResponseBody
    public String patientDel(@RequestParam("patientNo") String patientNo) {
        boolean result = patientService.deletePatientByNo(patientNo);
        Map<String, String> map = new HashMap<String, String>();
        if (result) {
            map.put("delResult", "true");
        } else {
            map.put("delResult", "false");
        }
        return JSON.toJSONString(map);
    }

    @RequestMapping("patientModInfo")
    public String patientModInfo(Model model, @RequestParam("patientNo") String patientNo) {
        try {
            Patient patient = patientService.getPatientByNo(patientNo);
            model.addAttribute("patient", patient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "patient/patientMod";
    }

    @RequestMapping("patientModMethod")
    public String patientModMethod(HttpSession session, Patient patient) {
        try {
            if (patientService.modify(patient)) {
                return "redirect:patientList";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:patientMod";
    }
    @RequestMapping("patientInfoMethod")
    public String patientInfoMethod(Model model,@RequestParam("patientNo")String patientNo) {
        try {
            Patient patient = patientService.getPatientByNo(patientNo);
            model.addAttribute("patient",patient);

            String patientName = patient.getPatientName();
            List<History> historyList = historyService.getHistoryByName(patientName);
            model.addAttribute("historyList",historyList);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "patient/patientInfo";
    }

    @RequestMapping("patientAddMethod")
    public String patientAddMethod(Patient patient) {
        try {
            if(patientService.add(patient)) {
                return "redirect:patientList";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:patientAdd";
    }
}