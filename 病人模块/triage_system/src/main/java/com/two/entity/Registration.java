package com.two.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-19 14:25
 */
public class Registration {
    private Integer regNo;//病号序号
    private String regPatientName;//患者
    private String regPatientSymptoms;//病症
    private String regClinicName;//科室
    private String regDoctorName;//医生名字
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")  //,timezone=”GMT+8”
    private String regDate;
     private String diagnosis;

    public Registration() {
    }

    @Override
    public String toString() {
        return "Registration{" +
                "regNo=" + regNo +
                ", regPatientName='" + regPatientName + '\'' +
                ", regPatientSymptoms='" + regPatientSymptoms + '\'' +
                ", regClinicName='" + regClinicName + '\'' +
                ", regDoctorName='" + regDoctorName + '\'' +
                ", regDate='" + regDate + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public void setRegNo(Integer regNo) {
        this.regNo = regNo;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Registration(Integer regNo, String regPatientName,
                        String regPatientSymptoms, String regClinicName, String regDoctorName, String regDate) {
        this.regNo = regNo;
        this.regPatientName = regPatientName;
        this.regPatientSymptoms = regPatientSymptoms;
        this.regClinicName = regClinicName;
        this.regDoctorName = regDoctorName;
        this.regDate = regDate;
    }

    public Integer getRegNo() {
        return regNo;
    }

    public void setRegNO(Integer regNo) {
        this.regNo = regNo;
    }

    public String getRegPatientName() {
        return regPatientName;
    }

    public void setRegPatientName(String regPatientName) {
        this.regPatientName = regPatientName;
    }

    public String getRegPatientSymptoms() {
        return regPatientSymptoms;
    }

    public void setRegPatientSymptoms(String regPatientSymptoms) {
        this.regPatientSymptoms = regPatientSymptoms;
    }

    public String getRegClinicName() {
        return regClinicName;
    }

    public void setRegClinicName(String regClinicName) {
        this.regClinicName = regClinicName;
    }

    public String getRegDoctorName() {
        return regDoctorName;
    }

    public void setRegDoctorName(String regDoctorName) {
        this.regDoctorName = regDoctorName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
