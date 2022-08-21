package customersortandsearch;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 *
 * @author chech
 */
public class CustomerSortAndSearch {

    private static ArrayList<Customer> customers = new ArrayList<>(5);

    public static void main(String[] args) {
        //5 customer objects
        customers.add(new Customer(15, "Chris", "aaa@gmail.com", "(04)12345675"));
        customers.add(new Customer(16, "Helen", "bbb@gmail.com", "(04)66463726"));
        customers.add(new Customer(11, "Tim", "ccc@gmail.com", "(04)27846539"));
        customers.add(new Customer(13, "Lavinia", "ddd@gmail.com", "(04)12988387"));
        customers.add(new Customer(12, "Jason", "eee@gmail.com", "(04)93847365"));

        System.out.println("Original(unsorted) customer's information.");
        System.out.println();
        for (Customer c : customers) {
            c.displayData();//Display all datas
        }
        System.out.println();
        System.out.println();
        userOptions();//Offer customers sort and search options
    }

    public static void search() {
        //Searching the customer by using customer's ID
        int target = 0;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        boolean askAgain = false;
        do {
            try {
                System.out.println();
                System.out.println("What customer ID would you like to search for?");
                target = sc.nextInt();
                for (Customer c : customers) {
                    if (target == c.getId()) {
                        System.out.println("Customer ID " + target + " was Found.");
                        c.displayData();//The found customer's info is shown
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println();
                    System.out.println("Customer ID " + target + " was not found");
                }
                break;
            } catch (InputMismatchException err) {
                System.out.println("***Please enter an interger or an appropriate value(Two digits)");
                askAgain = true;
                sc.nextLine();
            }
        } while (askAgain = true);
    }

    public static void userOptions() {
        Scanner sc = new Scanner(System.in);
        int userOption;
        boolean askAgain = false;

        do {
            try {
                System.out.println();
                System.out.println("Choose 1 to sort the customer data. Choose 2 to search for the customer");
                userOption = sc.nextInt();
                if (userOption == 1) {
                    System.out.println("Data sorted by customer ID.");
                    System.out.println();
                    Collections.sort(customers);//sort the data 
                    for (Customer c : customers) {
                        c.displayData();
                    }
                    break;
                } else if (userOption == 2) {
                    search();
                    break;
                } else {
                    System.out.println("*** Only number 1 and 2 ***");
                }
            } catch (InputMismatchException err) {
                System.out.println("*** Please enter an interger or an appropriate value(Two digits) ***");
                System.out.println();
                sc.nextLine();

            }
        } while (askAgain = true);
    }

}
