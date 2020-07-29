package com.two.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 14:09
 */
public class Patient {

    private Integer patientNo;//患者编号
    private String patientName;//患者名字
    private String patientSex;//患者性别
    private  String patientAge;//患者年龄
     private String patientAddress;//患者地址
    private String patientTel;//患者电话
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String appDate;

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientNo=" + patientNo +
                ", patientName='" + patientName + '\'' +
                ", patientSex='" + patientSex + '\'' +
                ", patientAge='" + patientAge + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientTel='" + patientTel + '\'' +
                ", appDate='" + appDate + '\'' +
                '}';
    }

    public Integer getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(Integer patientNo) {
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

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
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



    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }


}
