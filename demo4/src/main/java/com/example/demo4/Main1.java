import java.io.IOException;
import java.util.Scanner;
public class Main1 {
     public static void main(String[] args) throws IOException {
         //Menu implementation
         //Introduce scanner object variable
         Scanner sc = new Scanner(System.in);
         //Static variables used in whole programme
         String[] que1 = new String[0];
         String[] que2 = new String[0];
         String[] que3 = new String[0];
         Double Fuel_Stock = 0.0;
         FuelQueue1 obj = new FuelQueue1(que1,que2,que3,Fuel_Stock);
         while(true) {
             System.out.println("""
                     100 or VFQ: View all Fuel Queues.
                     101 or VEQ: View all Empty Queues.
                     102 or ACQ: Add customer to a Queue.
                     103 or RCQ: Remove a customer from a Queue.
                     104 or PCQ: Remove a served customer.
                     105 or VCS: View Customers Sorted in alphabetical order.
                     106 or SPD: Store Program Data into file.
                     107 or LPD: Load Program Data from file.
                     108 or STK: View Remaining Fuel Stock.
                     109 or AFS: Add Fuel Stock.
                     999 or EXT: Exit the Program.""");
             System.out.print("Enter your option: ");
             String choice = sc.nextLine();
             switch (choice) {
                 case "100":
                 case "VFQ":
                     obj.VFQ();
                     break;
                 case "101":
                 case "VEQ":
                     obj.VEQ();
                     break;
                 case "102":
                 case "ACQ":
                     try {
                         System.out.print("Enter customer name: ");
                         String name = sc.nextLine();
                         obj.ACQ(name);
                     }catch(Exception e){
                         System.out.println("Please enter only string value");
                     }
                     break;
                 case "103":
                 case "RCQ":
                     obj.RCQ();
                     break;
                 case "104":
                 case "PCQ":
                     obj.PCQ();
                     break;
                 case "105":
                 case "VCS":
                     obj.VCS();
                     break;
                 case "106":
                 case "SPD":
                     obj.SPD();
                     break;
                 case "107":
                 case "LPD":
                     obj.LPD();
                     break;
                 case "108":
                 case "STK":
                     obj.STK();
                     break;
                 case "109":
                 case "AFS":
                     try{
                         System.out.print("Enter the new stock amount(liters): ");
                         Double new_stock = sc.nextDouble();
                         obj.AFS(new_stock);
                     }catch (Exception e){
                         System.out.println("Please enter a integer value");
                     }
                     break;
                 case "999":
                 case "EXT":
                     System.exit(0);
                 default:
                     System.out.println("Check the menu again and choose a valid option");
             }
         }

     }
}
