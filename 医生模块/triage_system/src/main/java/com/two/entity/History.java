package com.two.entity;

public class History {
    private String historyNo;
    private String patientName;
    private String historyDate;
    private String historyDiagnosis;

    public History() {
    }

    public History(String historyNo, String patientName, String historyDate, String historyDiagnosis) {
        this.historyNo = historyNo;
        this.patientName = patientName;
        this.historyDate = historyDate;
        this.historyDiagnosis = historyDiagnosis;
    }

    public String getHistoryNo() {
        return historyNo;
    }

    public void setHistoryNo(String historyNo) {
        this.historyNo = historyNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHistoryDate() {
        return historyDate;
    }

    public void setHistoryDate(String historyDate) {
        this.historyDate = historyDate;
    }

    public String getHistoryDiagnosis() {
        return historyDiagnosis;
    }

    public void setHistoryDiagnosis(String historyDiagnosis) {
        this.historyDiagnosis = historyDiagnosis;
    }

    @Override
    public String toString() {
        return "History{" +
                "historyNo='" + historyNo + '\'' +
                ", patientName='" + patientName + '\'' +
                ", historyDate='" + historyDate + '\'' +
                ", historyDiagnosis='" + historyDiagnosis + '\'' +
                '}';
    }
}
