package schlomer.customer;

/**
 * Created by Anthony on 2/4/2016.
 */
import java.util.*;


public class CustomerApp {
    public static void main(String[] args) {
        // Create scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Customer Viewer\n");

        // Ask for customer number
        System.out.println("Enter a customer number: ");
        int custID = sc.nextInt();

        // create new database
        CustomerDB dataBase = new CustomerDB();
        Customer newCustomer = dataBase.customerFinder(custID);

        // If the customer number is not in the records
        if (newCustomer == null) {
            System.out.println("There is no customer number " + custID + " in our records.");
            System.out.println("");
        }
        // if customer number is in records
        else {
            System.out.println(newCustomer.getNameAndAddress());
            System.out.println();
        }

        // create variable for response to "Display another customer" question
        String response = "";
        do {
            // Ask if they want to continue
            System.out.println("Display another customer? (y/n): ");
            response = sc.next();
            // If the response is not y/n, then tell user that it is not a valid input
            if (!(response.equalsIgnoreCase("n")) && !(response.equalsIgnoreCase("y"))){
                System.out.println("Not a valid input");
                System.out.println();
            }
            // If they choose no, then continue do-while loop
            else if (response.equalsIgnoreCase("n")) {
                continue;
            }
            // If they choose yes
            else if (response.equalsIgnoreCase("y")){
                // Ask for another customer number and repeat process
                System.out.println("Enter a customer number: ");
                custID = sc.nextInt();
                dataBase = new CustomerDB();
                newCustomer = dataBase.customerFinder(custID);
                if (newCustomer == null) {
                    System.out.println("There is no customer number " + custID + " in our records.");
                    System.out.println();
                }
                else {
                    System.out.println(newCustomer.getNameAndAddress());
                    System.out.println();
                }
            }
        } while(!(response.equalsIgnoreCase("n")));
    }
}
