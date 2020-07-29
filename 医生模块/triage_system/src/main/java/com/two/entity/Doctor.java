package com.two.entity;

/**
 * 医生的实体类
 */
public class Doctor {
    private String doctorNo;//医生id
    private String doctorName;//医生名字
    private String doctorSex;//医生性别
    private String doctorTel;//医生电话
    private String doctorBel;//医生所属诊室
    private String doctorPassword;//医生密码


    public String getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(String doctorNo) {
        this.doctorNo = doctorNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex;
    }

    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel;
    }

    public String getDoctorBel() {
        return doctorBel;
    }

    public void setDoctorBel(String doctorBel) {
        this.doctorBel = doctorBel;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public Doctor(String doctorNo, String doctorName, String doctorSex, String doctorTel, String doctorBel, String doctorPassword) {
        this.doctorNo = doctorNo;
        this.doctorName = doctorName;
        this.doctorSex = doctorSex;
        this.doctorTel = doctorTel;
        this.doctorBel = doctorBel;
        this.doctorPassword = doctorPassword;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "doctor{" +
                "doctorNo='" + doctorNo + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", doctorSex='" + doctorSex + '\'' +
                ", doctorTel='" + doctorTel + '\'' +
                ", doctorBel='" + doctorBel + '\'' +
                ", doctorPassword='" + doctorPassword + '\'' +
                '}';
    }
}
