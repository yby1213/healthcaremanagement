package com.two.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Patient {
    private String patientNo;//病人编号
    private String patientName;//病人姓名
    private String patientSex;//病人性别
    private Integer patientAge;//病人年龄
    private String patientAddress;//病人地址
    private String patientTel;//病人电话

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date appDate;//预约日期

    public Patient() {
    }

    public Patient(String patientNo, String patientName, String patientSex, Integer patientAge, String patientAddress, String patientTel, Date appDate) {
        this.patientNo = patientNo;
        this.patientName = patientName;
        this.patientSex = patientSex;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientTel = patientTel;
        this.appDate = appDate;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientTel() {
        return patientTel;
    }

    public void setPatientTel(String patientTel) {
        this.patientTel = patientTel;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientNo='" + patientNo + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patientSex='" + patientSex + '\'' +
                ", patientAge=" + patientAge +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientTel='" + patientTel + '\'' +
                ", appDate=" + appDate +
                '}';
    }
}
