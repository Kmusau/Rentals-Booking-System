package com.rentals.dtos;

/**
 * Created by sylvester
 * Project Rentals-Booking-System
 * User: sylvester
 * Date: 5/20/20
 * Time: 6:46 PM
 */
public class CustomerDTO {
    private int idNumber;
    private String password;
    private String email;
    private String fname;
    private String lname;
    private int phoneNumber;

    public CustomerDTO() {
    }

    public CustomerDTO(int idNumber, String password, String email, String fname, String lname, int phoneNumber) {
        this.idNumber = idNumber;
        this.password = password;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.phoneNumber = phoneNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
