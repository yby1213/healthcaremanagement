package com.two.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.Date;

public class Registration {
    private String regNo;//挂号表编号
    private String regPatientName;//挂号病人姓名
    private String regPatientSymptoms;//挂号病人病症
    private String regClinicName;//挂号诊室名
    private String regDoctorName;//挂号医生姓名

    private Integer remaining;//前方剩余人数

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date regDate;//就诊日期
    private String diagnosis;//诊治信息

    public Registration() {
    }

    public Registration(String regNo, String regPatientName, String regPatientSymptoms, String regClinicName, String regDoctorName, Date regDate, String diagnosis) {
        this.regNo = regNo;
        this.regPatientName = regPatientName;
        this.regPatientSymptoms = regPatientSymptoms;
        this.regClinicName = regClinicName;
        this.regDoctorName = regDoctorName;
        this.regDate = regDate;
        this.diagnosis = diagnosis;
    }

    public Registration(String regNo, String regPatientName, String regPatientSymptoms, String regClinicName, String regDoctorName, Integer remaining, Date regDate, String diagnosis) {
        this.regNo = regNo;
        this.regPatientName = regPatientName;
        this.regPatientSymptoms = regPatientSymptoms;
        this.regClinicName = regClinicName;
        this.regDoctorName = regDoctorName;
        this.remaining = remaining;
        this.regDate = regDate;
        this.diagnosis = diagnosis;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
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

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "regNo='" + regNo + '\'' +
                ", regPatientName='" + regPatientName + '\'' +
                ", regPatientSymptoms='" + regPatientSymptoms + '\'' +
                ", regClinicName='" + regClinicName + '\'' +
                ", regDoctorName='" + regDoctorName + '\'' +
                ", remaining=" + remaining +
                ", regDate=" + regDate +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
