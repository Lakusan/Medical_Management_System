package de.srh.model;

public class Appointment {
    int appointmentID;
    String date;
    String time;

    int treatmentId;

    String diagnosis;
    int userId;

    public Appointment(int appointmentID, String date, String time, int treatmentId, String diagnosis, int userId) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.treatmentId = treatmentId;
        this.diagnosis = diagnosis;
        this.userId = userId;
    }

    public Appointment(String date, String time, int treatmentId, String diagnosis, int userId) {
        this.date = date;
        this.time = time;
        this.treatmentId = treatmentId;
        this.diagnosis = diagnosis;
        this.userId = userId;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(int treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", treatmentId=" + treatmentId +
                ", diagnosis='" + diagnosis + '\'' +
                ", userId=" + userId +
                '}';
    }
}
