package model;

import java.util.List;

public class UserDataBuilder {

    private String fname;
    private String invalidFname;
    private String lname;
    private String invalidLname;
    private List<String> email;
    private List<String> invalidEmail;
    private String pass;
    private String emptyPass;
    private String address;
    private String city;
    private String zip;
    private String phoneNo;
    private String MSG;
    private String invalidMSG;

    public UserDataBuilder setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public UserDataBuilder setInvalidFname(String invalidFname) {
        this.invalidFname = invalidFname;
        return this;
    }

    public UserDataBuilder setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public UserDataBuilder setInvalidLname(String invalidLname) {
        this.invalidLname = invalidLname;
        return this;
    }

    public UserDataBuilder setEmail(List<String> email) {
        this.email = email;
        return this;
    }

    public UserDataBuilder setInvalidEmail(List<String> invalidEmail) {
        this.invalidEmail = invalidEmail;
        return this;
    }

    public UserDataBuilder setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public UserDataBuilder setEmptyPass(String emptyPass) {
        this.emptyPass = emptyPass;
        return this;
    }

    public UserDataBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserDataBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public UserDataBuilder setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public UserDataBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public UserDataBuilder setMsg(String msg) {
        this.MSG = msg;
        return this;
    }

    public UserDataBuilder setInvalidMSG(String invalidMSG) {
        this.invalidMSG = invalidMSG;
        return this;
    }

    public UserData build() {
        return new UserData(fname, invalidFname, lname, invalidLname, email, invalidEmail,
                pass, emptyPass, address, city, zip, phoneNo, MSG, invalidMSG);
    }
}


