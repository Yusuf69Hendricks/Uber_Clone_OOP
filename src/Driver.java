public class Driver extends Person {

    //instance variables
    Car car;
    String licenseID;

    // an instance variable is a variable defined in a class, for which each instantiated object of the class has a separate copy, or instance. An instance variable is similar to a class variable.
    
    //constructor
    Driver(Car car, String licenseID, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);   
        this.car = car;
        this.licenseID = licenseID;    
    }

    

    // BASICALLY SETTING THE DIFFERENT PARRAMETERS
    // an instance variable is a variable defined in a class, for which each instantiated object of the class has a separate copy, or instance. An instance variable is similar to a class variable.


    //methods
    // GETTERS AND SETTERS ARE BASICALLY WAYS OF HOW TO ACCSES A VARIABLE THAT HAS BEEN MADE PRIVATE, AND RETURNING THE VALUE OF THAT VARIABLE
    // The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
    // The get method returns the variable value, and the set method sets the value.

    //setters
    public void setCar(Car car){
        this.car = car;
    }

    public void setlicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    public Car getCar(){
        return this.car;
    }

    public String getlicenseID(){
        return  this.licenseID;
    }

    // BASICALLY OUTPUTING A NUMBER OBJECT TO A STRING

    public String toString(){
        return super.toString() + " and I am a driver";
    }
    
    
    
}