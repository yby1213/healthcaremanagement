package com.two.entity;

public class Clinic {
    private int clinicNo;//科室编号
    private String clinicName;//科室名
    private String clinicAddress;//科室地址
    private String  clinicDoc;//科室对应的医生
    private String  clinicIntroduce;//科室介绍

    public Clinic(int clinicNo, String clinicName, String clinicAddress, String clinicDoc, String clinicIntroduce) {
        this.clinicNo = clinicNo;
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
        this.clinicDoc = clinicDoc;
        this.clinicIntroduce = clinicIntroduce;
    }

    public Clinic() {
    }

    public int getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(int clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getClinicDoc() {
        return clinicDoc;
    }

    public void setClinicDoc(String clinicDoc) {
        this.clinicDoc = clinicDoc;
    }

    public String getClinicIntroduce() {
        return clinicIntroduce;
    }

    public void setClinicIntroduce(String clinicIntroduce) {
        this.clinicIntroduce = clinicIntroduce;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "clinicNo='" + clinicNo + '\'' +
                ", clinicName='" + clinicName + '\'' +
                ", clinicAddress='" + clinicAddress + '\'' +
                ", clinicDoc='" + clinicDoc + '\'' +
                ", clinicIntroduce='" + clinicIntroduce + '\'' +
                '}';
    }
}
