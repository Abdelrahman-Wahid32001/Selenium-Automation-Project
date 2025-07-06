package data;

public class UserValidData {
    private String Fname;
    private String Lname;
    private String Email;
    private String Pass;
    private String Address;
    private String City;
    private int phoneNo;
    private String zip;


        // Constructor
        public UserValidData() {
            this.Fname = "Abdo";
            this.Lname = "Wahid";
            this.Email = "abdo@example.com";
            this.Pass = "12345678";
            this.Address = "Cairo";
            this.City = "Giza";
            this.zip = "112233";
            this.phoneNo = 333396;

        }
    // Getters
    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmail() {
        return Email;
    }

    public String getPass() {
        return Pass;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }
    public String getAddress(){return Address;}
    public String getCity(){return City;}
    public String getZip(){return zip;}

}
