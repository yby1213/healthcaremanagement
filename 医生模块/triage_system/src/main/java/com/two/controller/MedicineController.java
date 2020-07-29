package com.two.controller;

import com.alibaba.fastjson.JSON;
import com.two.entity.Doctor;
import com.two.entity.Medicine;
import com.two.service.MedicineService;
import com.two.tools.Constants;
import com.two.tools.PageSupport;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MedicineController {
    private Logger logger = Logger.getLogger(MedicineController.class);
    @Resource
    private MedicineService medicineService;

    @RequestMapping("medicineAdd")//添加
    public String medicineAdd() {
        System.out.println("========用户访问了medicineAdd方法===========");
        return "medicine/medicineAdd";
    }

    @RequestMapping("medicineAddSave")//添加保存
    public String medicineAddSave(Medicine medicine) throws Exception {

        if (medicineService.add(medicine)) {
            System.out.println(medicine.getMedicineDisease());
            return"redirect:medicineList";

        }
        System.out.println("失败");
        return"medicineAdd";
    }
    @RequestMapping("medicineDel")//删除
    @ResponseBody
    public String medicineDel(@RequestParam("mno")String mno) throws Exception {
        System.out.println("lalile");
        boolean result = medicineService.deleteMedicineById(Integer.parseInt(mno));
        Map<String, String> map = new HashMap<String, String>();
        if (result) {
            map.put("delResult", "true");
        }else {
            map.put("delResult", "false");
        }

        return JSON.toJSONString(map);
    }
    @RequestMapping("medicineMod")//修改
    public String doctorMod() {
        return "medicine/medicineMod";
    }

    @RequestMapping("medicineList")//列
    public String medicineList(Model model, @RequestParam(value="queryname",required=false)String queryname,
                               @RequestParam(value="pageIndex",required=false)String pageIndex) throws Exception {
        List<Medicine> medicineList = null;
        int pageSize = Constants.pageSize;

        int currentPageNo = 1;
        if(pageIndex!=null&&pageIndex!="") {
            currentPageNo=Integer.parseInt(pageIndex);
        }

        int totalCount=medicineService.getMedicineCount(queryname);

        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);

        medicineList = medicineService.getMedicineList(queryname,currentPageNo,pageSize);

        model.addAttribute("pages", pages);
        model.addAttribute("medicineList",medicineList);
        return "medicine/medicineList";
    }


    @RequestMapping("medicineview")//查看
    public String userView(Model model , @RequestParam("mno")String mno) throws Exception {
        Medicine medicine = medicineService.getMedicineByMedicineNo(Integer.parseInt(mno));
        model.addAttribute("medicine",medicine);
        return "medicine/medicineInfo";
    }
    @RequestMapping("medicineModInfo")
    public String medicineModInfo(Model model, @RequestParam("medicineNo") Integer medicineNo) {
        try {
            Medicine medicine = medicineService.getMedicineByMedicineNo(medicineNo);
            model.addAttribute("medicine",medicine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "medicine/medicineMod";
    }

    @RequestMapping("medicineModMethod")
    public String medicineModMethod(HttpSession session, Medicine medicine) {
        try {
            if (medicineService.modify(medicine)) {
                return "redirect:medicineList";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:medicineMod";
    }

}
