package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.two.entity.Doctor;
import com.two.service.DoctorService;
import com.two.tools.Constants;
import com.two.tools.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DoctorController {

    @Resource
    private DoctorService doctorService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/dologin")
    @ResponseBody
    public Map<String,String> dologin(@RequestBody JSONObject JsonData,HttpServletRequest request){
        String tel = JsonData.getString("login");
        String pwd = JsonData.getString("pwd");
        Doctor doctor = doctorService.login(tel,pwd);
        String name = doctor.getDoctorName();
        Map<String,String> map = new HashMap<String,String>();
        if(null != doctor){
            map.put("Status","ok");
            map.put("Text","登录成功");
            map.put("name",name);
            request.getSession().setAttribute(Constants.USER_SESSION, doctor);
        }
        return map;
    }

    @RequestMapping("main")
    public String main(HttpSession session) {

        if(session.getAttribute(Constants.USER_SESSION)==null) {
            return "redirect:/login";
        }
        return "redirect:doctorList";
    }

    @RequestMapping("doctorAdd")
    public String doctorAdd() {
        return "doctor/doctorAdd";
    }

    @RequestMapping("doctorMod")
    public String doctorMod() {
        return "doctor/doctorMod";
    }

    @RequestMapping("doctorList")
    public String doctorList(Model model, @RequestParam(value="queryname",required=false)String queryname,
                              @RequestParam(value="pageIndex",required=false)String pageIndex){

        List<Doctor> doctorList = null;
        int pageSize = Constants.pageSize;

        int currentPageNo = 1;
        if(pageIndex!=null&&pageIndex!="") {
            currentPageNo=Integer.parseInt(pageIndex);
        }

        int totalCount=doctorService.getDoctorCount(queryname);

        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);

        doctorList = doctorService.getDoctorList(queryname, currentPageNo, pageSize);

        model.addAttribute("pages", pages);
        model.addAttribute("doctorList",doctorList);
        return "doctor/doctorList";
    }

    /**
     * 新增医生
     * @param doctor
     * @return
     */
    @RequestMapping("doctorAddMethod")
    public String doctorAdd(Doctor doctor){
        if (doctorService.add(doctor)){
            return "redirect:doctorList";
        }
        return "redirect:doctorAdd";
    }

    @RequestMapping("doctorInfo")
    public String doctorInfo(){
        return "doctor/doctorInfo";
    }

    /**
     * 展示医生个人信息
     * @param model
     * @param doctorNo
     * @return
     */
    @RequestMapping("doctorInfoMethod")
    public String doctorInfoMethod(Model model, @RequestParam("doctorNo")String doctorNo){
        try{
            Doctor doctor = doctorService.getDoctorByNo(doctorNo);
            model.addAttribute("doctor",doctor);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "doctor/doctorInfo";
    }
    @RequestMapping("doctorModInfo")
    public String doctorModInfo(Model model, @RequestParam("doctorNo") String doctorNo) {
        try {
            Doctor doctor = doctorService.getDoctorByNo(doctorNo);
            model.addAttribute("doctor",doctor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "doctor/doctorMod";
    }

    @RequestMapping("doctorModMethod")
    public String doctorModMethod(HttpSession session, Doctor doctor) {
        try {
            if (doctorService.modify(doctor)) {
                return "redirect:doctorList";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:doctorMod";
    }
    @RequestMapping("doctorDel")
    @ResponseBody
    public String doctorDel(@RequestParam("doctorNo")String doctorNo) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if(doctorService.deleteDoctorByNo(doctorNo)) {
            resultMap.put("delResult", "true");
        }else {
            resultMap.put("delResult", "false");
        }
        return JSON.toJSONString(resultMap);
    }
}
