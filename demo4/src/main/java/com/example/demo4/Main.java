package com.example.demo4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    //Static variables used in whole programme
    //Whole queues used in this program
    static LinkedList<String> Que1 = new LinkedList<>();
    static LinkedList<String> Que2 = new LinkedList<>();
    static LinkedList<String> Que3 = new LinkedList<>();
    static LinkedList<String> Que4 = new LinkedList<>();
    static LinkedList<String> Que5 = new LinkedList<>();
    static LinkedList<String> que1 = new LinkedList<>();
    static LinkedList<String> que2 = new LinkedList<>();
    static LinkedList<String> que3 = new LinkedList<>();
    static LinkedList<String> que4 = new LinkedList<>();
    static LinkedList<String> que5 = new LinkedList<>();
    static ArrayList<String> Wait = new ArrayList<>();	//Declaring String array list
    //Whole Fuel liters shown queue used in this program
    static LinkedList<Double> Fuel1 = new LinkedList<>();
    static LinkedList<Double> Fuel2 = new LinkedList<>();
    static LinkedList<Double> Fuel3 = new LinkedList<>();
    static LinkedList<Double> Fuel4 = new LinkedList<>();
    static LinkedList<Double> Fuel5 = new LinkedList<>();
    static LinkedList<Double> FuelW = new LinkedList<>();
    //Other main int values used in this program
    static Double Fuel_Stock = 0.0;
    static Double Income = 0.0;
    static Double Price = 430.0;

    public static void main(String[] args) throws IOException, InterruptedException {
         //Menu implementation
         System.out.println("Before run that program please load your data. If you newly started this program you don't want that. ");
         Time();
         //Introduce scanner object variable
         Scanner sc = new Scanner(System.in);
         //Connect this class with other two subclasses
         FuelQueue obj1 = new FuelQueue();
         Passenger obj2 = new Passenger();
         while(true) {
             System.out.println("""
                     100 or VFQ: View all Fuel Queues.
                     101 or VEQ: View all Empty Queues.
                     102 or ACQ: Add customer to a Queue.
                     103 or RCQ: Remove a customer from a Queue.(Before identify the customer index number)
                     104 or PCQ: Remove a served customer.
                     105 or VCS: View Customers Sorted in alphabetical order.
                     106 or SPD: Store Program Data into file.
                     107 or LPD: Load Program Data from file.
                     108 or STK: View Remaining Fuel Stock.
                     109 or AFS: Add Fuel Stock.
                     110 or IFS: Print the Income.
                     111 or PQD: Display Queues details.
                     999 or EXT: Exit the Program.""");
             System.out.print("Enter your option: ");
             String choice = sc.nextLine();
             switch (choice) {
                 case "100":
                 case "VFQ":
                     obj1.VFQ();
                     Time();
                     break;
                 case "101":
                 case "VEQ":
                     obj1.VEQ();
                     Time();
                     break;
                 case "102":
                 case "ACQ":
                 try {
                     System.out.print("Enter customer first name: ");
                     String fname = sc.nextLine();
                     System.out.print("Enter customer second name: ");
                     String lname = sc.nextLine();
                     System.out.print("Enter customer vehicle No: ");
                     String vehi = sc.nextLine();
                     try {
                         System.out.print("Enter No. of liters customer want: ");
                         double liters = sc.nextDouble();
                         obj2.ACQ(fname, lname, vehi, liters);
                         Time();
                         break;
                     } catch (Exception e) {
                         System.out.println("Please enter a integer value");
                     }
                 } catch (Exception e) {
                     System.out.println("Please enter only String values");
                 }
                 case "103":
                 case "RCQ":
                     obj1.RCQ();
                     Time();
                     break;
                 case "104":
                 case "PCQ":
                     obj1.PCQ();
                     Time();
                     break;
                 case "105":
                 case "VCS":
                     obj1.VCS();
                     Time();
                     break;
                 case "106":
                 case "SPD":
                     obj1.SPD();
                     Time();
                     break;
                 case "107":
                 case "LPD":
                     obj1.LPD();
                     Time();
                     break;
                 case "108":
                 case "STK":
                     obj1.STK();
                     Time();
                     break;
                 case "109":
                 case "AFS":
                     try{
                         System.out.print("Enter the new stock amount(liters): ");
                         Double new_stock = sc.nextDouble();
                         obj1.AFS(new_stock);
                     }catch (Exception e){
                         System.out.println("Please enter a integer value");
                     }
                     Time();
                     break;
                 case "110":
                 case "IFS":
                     obj1.IFS();
                     Time();
                     break;
                 case "111":
                 case "PQD":
                     MenuApplication.main();
                     break;
                 case "999":
                 case "EXT":
                     System.exit(0);
                 default:
                     System.out.println("Check the menu again and choose a valid option");
                     Time();
             }
         }
     }
     public static void Time() throws InterruptedException {
         //Time method used after every option user select
         sleep(2000);
     }
}
