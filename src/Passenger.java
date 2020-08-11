public class Passenger extends Person {

    //instance variables
    String email;

    //constructor
    Passenger(String email, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number, cash);
        this.email = email;
    }
    // BASICALLY ADDING ATTRIBUTES TO A VARIABLE TO MAKE AN OBJECT FROM THAT VARAIBLE
    // Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.



    //methods

    public void setEmail(String email){
        this.email  = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString(){
        return super.toString() + " and I am a passenger";
    }

    // This method is used to get a String object  output value of the Number Object.

    
}