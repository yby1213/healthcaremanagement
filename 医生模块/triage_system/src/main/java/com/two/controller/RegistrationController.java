package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.two.entity.Clinic;
import com.two.entity.Medicine;
import com.two.entity.Registration;
import com.two.service.MedicineService;
import com.two.service.RegistrationService;
import com.two.tools.Constants;
import com.two.tools.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RegistrationController {

    @Resource
    private RegistrationService registrationService;

    @Resource
    private MedicineService medicineService;

    @RequestMapping("registrationAdd")
    public String registrationAdd() {

        return "registration/registrationAdd";
    }
    @RequestMapping("registrationAddSave")
    public String registrationAddSave(Registration registration){
        try{
            if(registrationService.add(registration)) {
                return "redirect:/registrationList";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/registrationList";
    }

    @RequestMapping("registrationDel")
    @ResponseBody
    public String registrationDel(@RequestParam("registrationNo")String registrationNo){
        Map<String,String> map = new HashMap<String,String>();
        if(registrationService.deleteRegistrationByNo(registrationNo)){
            map.put("delResult","true");
        }else{
            map.put("delResult","false");
        }
        return JSON.toJSONString(map);
    }

    @RequestMapping("registrationMod")
    public String registrationMod() {
        return "registration/registrationMod";
    }

    @RequestMapping("registrationModList")
    public String registrationModList(@RequestParam("regNo")String regNo,Model model){
        Registration registration = null;
        List<Medicine> medicineList = null;
        try{
            if(registrationService.getRegistrationByNo(regNo)!=null){
                registration = registrationService.getRegistrationByNo(regNo);
                medicineList = medicineService.getMedicineModList();
                model.addAttribute("regList",registration);
                model.addAttribute("medicineList",medicineList);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "registration/registrationMod";
    }

    @RequestMapping("registrationModSave")
    public String registrationModSave(Registration registration){
        boolean flag = registrationService.modify(registration);
        if(flag==true){
            return "redirect:/registrationList";
        }
        return "redirect:/registrationList";
    }

    @RequestMapping("registrationList")
    public String registrationList(Model model, @RequestParam(value="queryname",required=false)String queryname,
                                   @RequestParam(value="pageIndex",required=false)String pageIndex){
        List<Registration> registrationList = null;
        int pageSize = Constants.pageSize;

        int currentPageNo = 1;
        if(pageIndex!=null&&pageIndex!="") {
            currentPageNo=Integer.parseInt(pageIndex);
        }

        int totalCount=registrationService.getRegistrationCount(queryname);

        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);

        registrationList = registrationService.getRegistrationList(queryname, currentPageNo, pageSize);

        model.addAttribute("pages", pages);
        model.addAttribute("registrationList", registrationList);
        return "registration/registrationList";
    }

    @RequestMapping("registrationInfo")
    public String registrationInfo(){
        return "registration/registrationInfo";
    }

    @RequestMapping("registrationInfoMethod")
    public String registrationInfoMethod(Model model,@RequestParam("regNo")String regNo) {
        try {
            Registration registration = registrationService.getRegistrationByNo(regNo);
            model.addAttribute("registration",registration);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "registration/registrationInfo";
    }
}
