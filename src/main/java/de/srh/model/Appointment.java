package de.srh.model;

public class Appointment {
    int appointmentID;
    String date;
    String time;

    int treatmentId;

    String diagnosis;
    int patientID;

    String firstname;
    String lastname;

    float activeBillSum;

    String price;
    public Appointment(String date, String time, int treatmentId, String diagnosis, int patientID, String firstname, String lastname) {
        this.date = date;
        this.time = time;
        this.treatmentId = treatmentId;
        this.diagnosis = diagnosis;
        this.patientID = patientID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Appointment(int appointmentID, String date, String time, int treatmentId, String diagnosis, int patientID, String firstname, String lastname) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.treatmentId = treatmentId;
        this.diagnosis = diagnosis;
        this.patientID = patientID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Appointment(int appointmentID, String date, String time, int treatmentId, String diagnosis, int patientID, String firstname, String lastname, String price) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.treatmentId = treatmentId;
        this.diagnosis = diagnosis;
        this.patientID = patientID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.price = price;
    }

    public Appointment(int appointmentID, int patientID, float activeBillSum){
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.activeBillSum = activeBillSum;
    }

    public Appointment(int appointmentID, String price){
        this.appointmentID = appointmentID;
        this.price = price;
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

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getActiveBillSum() {
        return activeBillSum;
    }

    public void setActiveBillSum(float activeBillSum) {
        this.activeBillSum = activeBillSum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", treatmentId=" + treatmentId +
                ", diagnosis='" + diagnosis + '\'' +
                ", patientID=" + patientID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", activeBillSum=" + activeBillSum +
                ", price='" + price + '\'' +
                '}';
    }
}
