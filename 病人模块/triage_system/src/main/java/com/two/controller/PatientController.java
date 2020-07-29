package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.two.entity.Patient;
import com.two.entity.Registration;
import com.two.service.ClinicService;
import com.two.service.DoctorService;
import com.two.service.PatientService;
import com.two.service.RegistrationService;
import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 16:05
 */
@Controller
public class PatientController {

    private Logger logger = Logger.getLogger(PatientController.class);
@Resource
private PatientService patientService;
@Resource
private RegistrationService registrantionService;
@Resource
private DoctorService doctorService;

    @Resource
    private ClinicService clinicService;
//进入医院首页界面
	@RequestMapping("login.html")
	public String login() {
		logger.debug("===============用户访问了PatientController的login方法===============");
		return "index";
	}
//进入预约界面

	@RequestMapping("registrationAdd.html")
	public String patientAdd(@ModelAttribute("registration")Registration registration){
		logger.debug("---------访问了预约界面");

		return "appint";
	}
//预约
   @RequestMapping("registrationAddSave")
	public String registrationAdd(HttpSession session, Registration registration,Patient patient,
								  @RequestParam(value = "regPatientName",required = false)String regPatientName) {
		// user插入添加入的id
		patient=patientService.getRegistration(regPatientName);
		//registration=registrantionService.getRegistration(regPatientName);
			if(null!=patient){
				if (registrantionService.addReg(registration)) {
				return "success";
			}else{
					return "appint";
			}
		}else{
				return "patientAdd";
		}
	}
//如果患者没之前预约过的，就跳到patientAdd.jsp页面填写一些信息
@RequestMapping("patientAddSave")
	public String patientAdd(HttpSession session,Patient patient){
		if(patientService.add(patient)){
			return "appint";
		}else{
			return "patientAdd";
		}
	}
//这代表预约成功
	@RequestMapping("success.html")
	public String rePatient(@ModelAttribute("patient")Patient patient){
		logger.debug("---------访问了预约界面");
		return "appint";
	}
//在预约界面跳出公告
	@RequestMapping(value="getRegistrationList", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getRegistrationList(Model model) {
		List<Registration> registrationList = registrantionService.getRegistrationList();
		String jsonStr = JSON.toJSONString(registrationList);
		System.out.println(jsonStr);
		return jsonStr;
	}

//查看病历页面
	@RequestMapping("quarry.html")
	public String querry() {
		logger.debug("===============用户访问了PatientController的querry界面===============");
		return "quarry";
	}
//查询操作
@RequestMapping("getDia")
	public String getDia(@RequestParam(value = "regPatientName",required = false)String regPatientName,
							   @RequestParam(value = "patientTel",required = false)String patientTel,Model model){
	List<Registration> diagnosisList = registrantionService.getDiagnosis(regPatientName, patientTel);
	System.out.println("信息是："+diagnosisList);
	model.addAttribute("diagnosisList",diagnosisList);
	return "quarry";
	}
}
