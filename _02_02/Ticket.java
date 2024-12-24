package _02_02;

public class Ticket {

  public Ticket() {
    // konstruktor
    // The constructor contains any code that you want to execute when an instance
    // of the class is created.
    // ovde stavljamo sta zelimo da uradimo kada pravimo novu instancu ove klase
    // "Ticket"
    // kada u nekoj drugoj klasi pravimo instancu :
    // Ticket nesto = new Ticket(u zagradu stavljamo);
  }
  // String name;

  // public String getName(){
  // The first word in the method declaration tells us what the access level is.
  // For example, if it says public, then any other class can access that method.
  // If it says private, it can only be accessed within that class.
  // return name;
  // name je atribut instance koju smo napravili i
  // }
  // varijable koje smo deklarisali nemaju vrednost i private su da bi mogli da ih
  // sakrijemo od drugih klasa (encapsulation)

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three public methods to set the value of each field, called
  // setDestination, setPrice and setIsReturn.

  public void setDestination(String whereToGo) {
    // void nista ne vraca
    // String zato sto je destination String
    destination = whereToGo;
    // ili
    // this.destination = destination;
  }
  public void setPrice(double price) {
    //double price zato sto je price double
    this.price = price;
  }
  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }

  // Add three public methods to get the value of each field, called
  // getDestination, getPrice and getIsReturn.
  public String getDestination() {
    return destination;
  }
  public double getPrice() {
    return price;
  }
  public boolean getIsReturn() {
    return isReturn;
  }

}
