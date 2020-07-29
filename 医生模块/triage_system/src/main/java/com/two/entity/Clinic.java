package com.two.entity;

public class Clinic {
    private String clinicNo;
    private String clinicName;
    private String clinicAddress;
    private String  clinicDoc;
    private String  clinicIntroduce;

    public Clinic(String clinicNo, String clinicName, String clinicAddress, String clinicDoc, String clinicIntroduce) {
        this.clinicNo = clinicNo;
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
        this.clinicDoc = clinicDoc;
        this.clinicIntroduce = clinicIntroduce;
    }

    public Clinic() {
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
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
