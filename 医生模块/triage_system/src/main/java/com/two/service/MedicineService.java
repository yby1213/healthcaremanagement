package com.two.service;

import com.two.entity.Medicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineService {
    /**
     * 增加用户信息
     * @param connection
     * @param medicine
     * @return
     * @throws Exception
     */
    public boolean add(Medicine medicine)throws Exception;

    /**
     * 通过条件查询-medicineList
     * @param connection
     * @param medicineName
     * @param medicineNo
     * @return
     * @throws Exception
     */
    public List<Medicine> getMedicineList(@Param("medicineName") String medicineName, @Param("currentPageNo") int currentPageNo, @Param("pageSize") int pageSize)throws Exception;
    /**
     * 通过条件查询-药品表记录数
     * @param connection
     * @param medicineName
     * @param medicineNo
     * @return
     * @throws Exception
     */
    public int getMedicineCount(@Param("medicineName") String medicineName)throws Exception;
    /**
     * 通过userId删除user
     * @param delId
     * @return
     * @throws Exception
     */
    public boolean deleteMedicineById(Integer delId)throws Exception;


    /**
     * 通过userId获取user
     * @param connection
     * @param No
     * @return
     * @throws Exception
     */
    public Medicine getMedicineByMedicineNo(@Param("No") int No)throws Exception;

    /**
     * 修改用户信息
     * @param connection
     * @param medicine
     * @return
     * @throws Exception
     */
    public boolean modify(Medicine medicine)throws Exception;
    /**
     * 通过条件查询-medicineList
     * @return
     * @throws Exception
     */
    public List<Medicine> getMedicineModList()throws Exception;


}
