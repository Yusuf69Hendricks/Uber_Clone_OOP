public abstract class Ride {


    // this is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class.

    //variables
    String estartingPoint;
    String endingPoint;

    //methods that can be overriden
    public abstract double calculateDistance(String startingPoint, String endingPoint);
    public abstract Driver assignDriver();
    public abstract double calculateCost(String startingPoint, String endingPoint);
    public abstract void completePayment(Driver driver, Passenger passenger);

    // this abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass

 }