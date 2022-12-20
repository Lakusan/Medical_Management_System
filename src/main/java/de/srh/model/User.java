package de.srh.model;
/**
 * Data Model for Software users
 * @author Andreas Lakus
 */
public class User {
    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;

    private String password;

    private String phoneNum;

    private String title;

    private int isActivated;

    public boolean isActivated() {
        return isActivatedBoolean;
    }

    public void setActivated(boolean activated) {
        isActivatedBoolean = activated;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    boolean isActivatedBoolean;

    private String role;

    private int employeeId = 0;

    private String streetname;

    private String city;

    private String country;

    private int postalcode;
    private int houseNum;



    public User(String username, String firstname, String lastname, String email, String password, String phoneNum, String title, String streetname, String city, String country, int postalcode, int houseNum) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.title = title;
        this.streetname = streetname;
        this.city = city;
        this.country = country;
        this.postalcode = postalcode;
        this.houseNum = houseNum;
    }

    public User(int id, int employeeId, String username, String firstname, String lastname, String email, String phoneNum, boolean isActivatedBoolean, String role) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNum = phoneNum;
        this.isActivatedBoolean = isActivatedBoolean;
        this.role = role;
        this.employeeId = employeeId;
    }

    public User(String username, String firstname, String lastname, String email, String password, String phoneNum, String title ) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.title = title;

    }

    public User( int id, String username, String firstname, String lastname, String email, String password, String phoneNum, String title ) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.title = title;
    }

    public User( int id, String username, String firstname, String lastname, String email, int isActivated) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.isActivated = isActivated;
    }

    public User(String username, int id,  String firstname, String lastname, String email, String role) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(int isActivated) {
        this.isActivated = isActivated;
    }

    public boolean isActivatedBoolean() {
        return isActivatedBoolean;
    }

    public void setActivatedBoolean(boolean activatedBoolean) {
        isActivatedBoolean = activatedBoolean;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", title='" + title + '\'' +
                ", isActivated=" + isActivated +
                ", isActivatedBoolean=" + isActivatedBoolean +
                ", role='" + role + '\'' +
                ", employeeId=" + employeeId +
                ", streetname='" + streetname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalcode=" + postalcode +
                ", houseNum=" + houseNum +
                '}';
    }
}
