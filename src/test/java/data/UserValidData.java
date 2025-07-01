package data;

public class UserValidData {
    private String Fname;
    private String Lname;
    private String Email;
    private String Pass;

        // Constructor
        public UserValidData() {
            this.Fname = "Abdo";
            this.Lname = "Wahid";
            this.Email = "abdo@example.com";
            this.Pass = "12345678";
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
}
