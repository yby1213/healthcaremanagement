package com.two.service.impl;

import com.two.dao.MedicineMapper;
import com.two.entity.Medicine;
import com.two.service.MedicineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.List;

@Service("medicineService")
public class MedicineServiceImpl implements MedicineService {
    @Resource
    private MedicineMapper medicineMapper;
    @Override
    public boolean add(Medicine medicine) throws Exception {
        boolean flag = false;
        Connection connection = null;
        try {

            /*connection.setAutoCommit(false);//开启JDBC事务管理*/
            int updateRows = medicineMapper.add(medicine);
 /*           connection.commit();*/
            if(updateRows > 0){
                flag = true;
                System.out.println("add success!");
            }else{
                System.out.println("add failed!");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            try {
                System.out.println("rollback==================");
                /*connection.rollback();*/
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        return flag;

    }

    @Override
    public List<Medicine> getMedicineList(String medicineName, int currentPageNo, int pageSize) throws Exception {
        List<Medicine> medicineList = null;
        try {
            medicineList = medicineMapper.getMedicineList(medicineName,(currentPageNo-1)*pageSize,pageSize);
            System.out.println(medicineList);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return medicineList;
    }

    @Override
    public int getMedicineCount(String medicineName) throws Exception {
        Connection connection = null;
        int count = 0;
        System.out.println("medicineName ---- > " + medicineName);
        try {

            count = medicineMapper.getMedicineCount(medicineName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public boolean deleteMedicineById(Integer delId) throws Exception {
        boolean flag = false;
        try {

            if(medicineMapper.deleteMedicineById(delId)> 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Medicine getMedicineByMedicineNo(int No) throws Exception {
        Medicine medicine = null;

        try{

            medicine = medicineMapper.getMedicineByMedicineNo(No);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            medicine = null;
        }
        return medicine;
    }

    @Override
    public boolean modify(Medicine medicine) throws Exception {
        // TODO Auto-generated method stub
        boolean flag = false;
        try {
            System.out.println("modify medicine" + medicine);
            if(medicineMapper.modify(medicine) > 0)
                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Medicine> getMedicineModList() throws Exception {
        List<Medicine> medicineList = null;
        try {
            medicineList = medicineMapper.getMedicineModList();
            System.out.println(medicineList);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return medicineList;
    }
}
