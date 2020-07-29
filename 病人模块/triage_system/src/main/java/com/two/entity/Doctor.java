package com.two.entity;

/**
 * @Description
 * @auther tjj
 * @create 2020-07-18 20:50
 */
public class Doctor {
     private Integer doctorNo;//医生编号
    private String doctorName;//医生名
    private String doctorBel;//医生对应的科室

    public Doctor() {
    }

    public Integer getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(Integer doctorNo) {
        this.doctorNo = doctorNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorBel() {
        return doctorBel;
    }

    public void setDoctorBel(String doctorBel) {
        this.doctorBel = doctorBel;
    }
}
