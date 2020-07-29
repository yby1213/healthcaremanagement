package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.two.service.ClinicService;
import com.two.tools.Constants;
import com.two.tools.PageSupport;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.two.entity.Clinic;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

@Controller
public class ClinicController {

    @Resource
    private ClinicService clinicService;

    @RequestMapping("clinicAdd")
    public String clinicAdd() {
        return "clinic/clinicAdd";
    }

    @RequestMapping("clinicInfo")
    public String clinicInfo() {
        return "clinic/clinicInfo";
    }

    @RequestMapping("clinicMod")
    public String clinicMod() {
        return "clinic/clinicMod";
    }

    @RequestMapping("clinicList")
    public String clinicList(Model model, @RequestParam(value="queryname",required=false)String queryPname,
                             @RequestParam(value="pageIndex",required=false)String pageIndex){
        List<Clinic> clinicList = null;
        int pageSize = Constants.pageSize;

        int currentPageNo = 1;
        if(pageIndex!=null&&pageIndex!="") {
            currentPageNo=Integer.parseInt(pageIndex);
        }

        int totalCount=clinicService.getClinicCount(queryPname);

        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);

        clinicList = clinicService.getClinicList(queryPname, currentPageNo, pageSize);

        model.addAttribute("pages", pages);
        model.addAttribute("clinicList", clinicList);
        return "clinic/clinicList";
    }

    @RequestMapping("clinicInfoMethod")
    public String clinicInfoMethod(Model model,@RequestParam("clinicNo")String clinicNo) {
        try {
            Clinic clinic = clinicService.getClinicByNo(clinicNo);
            model.addAttribute("clinic",clinic);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "clinic/clinicInfo";
    }

    @RequestMapping("clinicAddMethod")
    public String clinicAddMethod(Clinic clinic) {
        try {
            if(clinicService.add(clinic)) {
                return "redirect:clinicList";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:clinicAdd";
    }

    @RequestMapping("clinicModInfo")
    public String clinicModInfo(Model model,@RequestParam("clinicNo")String clinicNo) {
        try {
            Clinic clinic = clinicService.getClinicByNo(clinicNo);
            model.addAttribute("clinic",clinic);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "clinic/clinicMod";
    }

    @RequestMapping("clinicModMethod")
    public String clinicModMethod(HttpSession session,Clinic clinic) {
        try {
            if (clinicService.modify(clinic)) {
                return "redirect:clinicList";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:clinicMod";
    }
    @RequestMapping("clinicDel")
    @ResponseBody
    public String clinicDel(@RequestParam("clinicNo")String clinicNo) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if(clinicService.deleteClinicByNo(clinicNo)) {
            resultMap.put("delResult", "true");
        }else {
            resultMap.put("delResult", "false");
        }
        return JSON.toJSONString(resultMap);
    }

}

