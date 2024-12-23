package PROJECT;

public class Guest{
    /// default constructor
    public Guest(){}
    /// main constructor
    public Guest(String firstname,String lastname,String phoneNumber,String email,String address,String city){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
    }
    /// attributes of class
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;

    /// getters
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){

        return this.city;
    }

    /// setters
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }

    /// method to display guest information
    public void displayGuestInformation(){
        System.out.println("Name:"+ firstname + " "+ lastname);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email:" + email);
        System.out.println("Address:" + address);
        System.out.println("City:" + city);
    }
}
