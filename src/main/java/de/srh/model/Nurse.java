package de.srh.model;

public class Nurse {

    int nurseID;
    String firstname;
    String lastname;
    boolean isAvailable;
    String department;
    String specialization;
    String email;
    String phoneNumber;
    String title;

    public Nurse(int nurseID, String firstname, String lastname, boolean isAvailable, String department, String specialization, String email, String phoneNumber, String title) {
        this.nurseID = nurseID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.isAvailable = isAvailable;
        this.department = department;
        this.specialization = specialization;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.title = title;
    }

    public Nurse(String firstname, String lastname, boolean isAvailable, String department, String specialization, String email, String phoneNumber, String title) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isAvailable = isAvailable;
        this.department = department;
        this.specialization = specialization;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.title = title;
    }

    public int getDoctorID() {
        return nurseID;
    }

    public void setDoctorID(int doctorID) {
        this.nurseID = doctorID;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseID=" + nurseID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isAvailable=" + isAvailable +
                ", department='" + department + '\'' +
                ", specialization='" + specialization + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
