package model;

import java.util.List;

public class UserData {

        public String Fname;
        public String InvalidFname;
        public String Lname;
        public String InvalidLname;
        public List<String> Email;
        public List<String> InvalidEmail;
        public String Pass;
        public String EmptyPass;
        public String Address;
        public String City;
        public String Zip;
        public String PhoneNo;
        public String MSG;
        public String InvalidMSG;

        public UserData() {}

        public UserData(String fname, String invalidFname, String lname, String invalidLname,
                        List<String> email, List<String> invalidEmail, String pass,
                        String emptyPass, String address, String city, String zip,
                        String phoneNo, String msg, String invalidMSG) {
                this.Fname = fname;
                this.InvalidFname = invalidFname;
                this.Lname = lname;
                this.InvalidLname = invalidLname;
                this.Email = email;
                this.InvalidEmail = invalidEmail;
                this.Pass = pass;
                this.EmptyPass = emptyPass;
                this.Address = address;
                this.City = city;
                this.Zip = zip;
                this.PhoneNo = phoneNo;
                this.MSG = msg;
                this.InvalidMSG = invalidMSG;
        }
}


