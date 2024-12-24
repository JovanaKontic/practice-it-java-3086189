package _02_06JK;

public class TicketMachine {

  public static void main(String[] args) {
    // PSVM - NE MOZE DA SE POKRENE BEZ

    // Create an object called ticket of type Ticket
    Ticket karta = new Ticket();
    // ili
    // Ticket ticket = new Ticket();

    // Set the destination of the ticket to New York
    karta.setDestination("New York");
    // ili
    // ticket.setDestination("New York");

    // Set the price of the ticket to 15.30
    karta.setPrice(15.30);

    // Set the isReturn value to true
    karta.setIsReturn(true);

    // Print the ticket's destination to the console
    System.out.println(karta.getDestination());

    // Print the ticket's price to the console
    System.out.println(karta.getPrice());

    // Print the ticket's isReturn value to the console
    System.out.println(karta.getIsReturn());

  }

}
