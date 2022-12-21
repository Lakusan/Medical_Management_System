package de.srh.model;


/**
 * @author Andreas Lakus
 */
public class Patient {

    int id;
    String firstname;
    String lastname;
    String title;
    String phoneNumber;
    String bloodgroup;
    String assignedDoctor;
    String assignedNurse;
    String currentSymptoms;
    int insuranceNumber;
    String insuranceType;
    String country;
    String dateOfBirth;
    String email;
    String city;
    String streetname;
    int postalcode;
    int houseNo;
    String paymentMethod;

    private int recordId;
    private String recordData;

    public Patient(int id, int recordId, String recordData) {
        this.id = id;
        this.recordId = recordId;
        this.recordData = recordData;
    }

    public Patient(int id, String recordData) {
        this.id = id;
        this.recordData = recordData;
    }

    public Patient(int id) {
        this.id = id;
    }
    public Patient(int id, String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor, String assignedNurse, String currentSymptoms, int insuranceNumber, String insuranceType, String country, String dateOfBirth, String email, String city, String streetname, int postalcode, int houseNo) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.insuranceNumber = insuranceNumber;
        this.insuranceType = insuranceType;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.city = city;
        this.streetname = streetname;
        this.postalcode = postalcode;
        this.houseNo = houseNo;
    }

    public Patient(String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor, String assignedNurse, String currentSymptoms, int insuranceNumber, String insuranceType, String country, String dateOfBirth, String email, String city, String streetname, int postalcode, int houseNo) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.insuranceNumber = insuranceNumber;
        this.insuranceType = insuranceType;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.city = city;
        this.streetname = streetname;
        this.postalcode = postalcode;
        this.houseNo = houseNo;
    }

    public Patient(int id, String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, int insuranceNumber, String insuranceType, String country, String dateOfBirth, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.insuranceNumber = insuranceNumber;
        this.insuranceType = insuranceType;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Patient(int id, String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, String country, String dateOfBirth, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Patient(int id, String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, String dateOfBirth, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Patient(String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, int insuranceNumber, String insuranceType, String country, String dateOfBirth, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.insuranceNumber = insuranceNumber;
        this.insuranceType = insuranceType;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Patient(String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, String country, String dateOfBirth, String email, int houseNo,
                   int postalcode, String streetname, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.houseNo = houseNo;
        this.postalcode = postalcode;
        this.streetname = streetname;
        this.city = city;
    }

    public Patient(String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, String country, String dateOfBirth, String email, int houseNo,
                   int postalcode, String streetname, String city, int insuranceNumber, String insuranceType, String paymentMethod) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.houseNo = houseNo;
        this.postalcode = postalcode;
        this.streetname = streetname;
        this.city = city;
        this.insuranceNumber = insuranceNumber;
        this.insuranceType = insuranceType;
        this.paymentMethod = paymentMethod;
    }


    public Patient(int id, String firstname, String lastname, String title, String phoneNumber, String bloodgroup, String assignedDoctor,
                   String assignedNurse, String currentSymptoms, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.bloodgroup = bloodgroup;
        this.assignedDoctor = assignedDoctor;
        this.assignedNurse = assignedNurse;
        this.currentSymptoms = currentSymptoms;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(String assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public String getAssignedNurse() {
        return assignedNurse;
    }

    public void setAssignedNurse(String assignedNurse) {
        this.assignedNurse = assignedNurse;
    }

    public String getCurrentSymptoms() {
        return currentSymptoms;
    }

    public void setCurrentSymptoms(String currentSymptoms) {
        this.currentSymptoms = currentSymptoms;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getRecordData() {
        return recordData;
    }

    public void setRecordData(String recordData) {
        this.recordData = recordData;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", title='" + title + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bloodgroup='" + bloodgroup + '\'' +
                ", assignedDoctor='" + assignedDoctor + '\'' +
                ", assignedNurse='" + assignedNurse + '\'' +
                ", currentSymptoms='" + currentSymptoms + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                ", insuranceType='" + insuranceType + '\'' +
                ", country='" + country + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", streetname='" + streetname + '\'' +
                ", postalcode=" + postalcode +
                ", houseNo=" + houseNo +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", recordId=" + recordId +
                ", recordData='" + recordData + '\'' +
                '}';
    }
}
