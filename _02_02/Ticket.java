package _02_02;

public class Ticket {

  public Ticket() {
    // konstruktor
    // The constructor contains any code that you want to execute when an instance
    // of the class is created.
    // ovde stavljamo sta zelimo da uradimo kada pravimo novu instancu ove klase "Ticket"
    // kada u nekoj drugoj klasi pravimo instancu :
    // Ticket nesto = new Ticket(u zagradu stavljamo);
  }
  String name;
  private String destination;
  private double price;
  private boolean isReturn;

  public String getName(){
    // The first word in the method declaration tells us what the access level is.
    // For example, if it says public, then any other class can access that method.
    // If it says private, it can only be accessed within that class.
    return name;
    //name je atribut instance koju smo napravili i

  }


  
  
}
