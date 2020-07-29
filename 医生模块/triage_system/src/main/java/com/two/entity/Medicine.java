package com.two.entity;

public class Medicine {
    private Integer medicineNo; //id
    private String medicineName; //药品名称medicineDisease
    private String medicineDisease; //药品作用
    private String medicineDoses; //服用指南

    public Medicine() {
        super();
    }

    public Integer getMedicineNo() {
        return medicineNo;
    }

    public void setMedicineNo(Integer medicineNo) {
        this.medicineNo = medicineNo;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineDisease() {
        return medicineDisease;
    }

    public void setMedicineDisease(String medicineDiease) {
        this.medicineDisease = medicineDiease;
    }

    public String getMedicineDoses() {
        return medicineDoses;
    }

    public void setMedicineDoses(String medicineDoses) {
        this.medicineDoses = medicineDoses;
    }

    public Medicine(Integer medicineNo, String medicineName, String medicineDiease, String medicineDoses) {
        this.medicineNo = medicineNo;
        this.medicineName = medicineName;
        this.medicineDisease = medicineDiease;
        this.medicineDoses = medicineDoses;
    }



    @Override
    public String toString() {
        return "Medicine{" +
                "medicineNo=" + medicineNo +
                ", medicineName='" + medicineName + '\'' +
                ", medicineDiease='" + medicineDisease + '\'' +
                ", medicineDoses='" + medicineDoses + '\'' +
                '}';
    }
}
