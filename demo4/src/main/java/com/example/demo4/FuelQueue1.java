import java.io.*;
import java.util.*;

public class FuelQueue1 {
    //Static variables used in whole programme
    private String[] que1;
    private String[] que2;
    private String[] que3;
    private Double Fuel_Stock;
    //Introduce scanner object variable
    Scanner sc = new Scanner(System.in);

    public FuelQueue1(String[] que1, String[] que2, String[] que3, Double Fuel_Stock){
        //Constructor class
        super();
        this.que1 = que1;
        this.que2 = que2;
        this.que3 = que3;
        this.Fuel_Stock = Fuel_Stock;
    }
    public void VFQ(){
        //View all queues
        System.out.println("This is queue 1: " + Arrays.toString(que1));
        System.out.println("This is queue 2: " + Arrays.toString(que2));
        System.out.println("This is queue 3: " + Arrays.toString(que3));
    }
    public void VEQ(){
        //View only empty queues
        if(que1.length==0 || que2.length==0 || que3.length==0) {
            if (que1.length == 0) {
                System.out.println("This is queue 1: " + Arrays.toString(que1));
            }
            if (que2.length == 0) {
                System.out.println("This is queue 2: " + Arrays.toString(que2));
            }
            if (que3.length == 0) {
                System.out.println("This is queue 3: " + Arrays.toString(que3));
            }
        }else{
            System.out.println("No empty Queues");
        }
    }
    public void ACQ(String Name){
        //Add customers to the queue checking after queues
        System.out.print("What queue do you want to enter:(1/2/3) ");
        int choice_que = sc.nextInt();
        if(choice_que == 1) {
            if (que1.length < 6) {
                ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(que1));
                arrayList1.add(Name);
                que1 = arrayList1.toArray(que1);
                System.out.println("Successfully you add to the queue 1");
            } else {
                System.out.println("This queue 1 is full fill");
            }
        } else if (choice_que == 2) {
            if (que2.length < 6) {
                ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(que2));
                arrayList2.add(Name);
                que2 = arrayList2.toArray(que2);
                System.out.println("Successfully you add to the queue 2");
            } else {
                System.out.println("This queue 2 is full fill");
            }
        } else if (choice_que == 3) {
            if (que3.length < 6) {
                ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(que3));
                arrayList3.add(Name);
                que3 = arrayList3.toArray(que3);
                System.out.println("Successfully you add to the queue 3");
            } else {
                System.out.println("This queue 3 is full fill");
            }
        }else{
            System.out.println("Please select a valid option");
        }
    }
    public void RCQ(){
        //Delete specific customer from a queue
        System.out.print("The customer do you want delete in which queue:(1/2/3) ");
        int del_queue = sc.nextInt();
        if(del_queue == 1){
            System.out.println("This is queue 1: " + Arrays.toString(que1));
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3) {
                try {
                    ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(que1));
                    arrayList1.remove(index_place - 1);
                    System.out.println("You successfully remove that customer");
                    que1 = arrayList1.toArray(que1);
                    List<String> list1 = new ArrayList<>();
                    for (String s1 : que1) {
                        if (s1 != null && s1.length() > 0) {
                            list1.add(s1);
                        }
                    }
                    que1 = list1.toArray(new String[0]);
                } catch (Exception e) {
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select a valid index number");
            }
        } else if (del_queue == 2) {
            System.out.println("This is queue 1: " + Arrays.toString(que2));
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3) {
                try{
                    ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(que2));
                    arrayList2.remove(index_place-1);
                    System.out.println("You successfully remove that customer");
                    que2 = arrayList2.toArray(que2);
                    List<String> list2 = new ArrayList<>();
                    for (String s2 : que2) {
                        if (s2 != null && s2.length() > 0) {
                            list2.add(s2);
                        }
                    }
                    que2 = list2.toArray(new String[0]);
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select a valid index number");
            }
        } else if (del_queue == 3) {
            System.out.println("This is queue 1: " + Arrays.toString(que3));
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3) {
                try{
                    ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(que3));
                    arrayList3.remove(index_place-1);
                    System.out.println("You successfully remove that customer");
                    que3 = arrayList3.toArray(que3);
                    List<String> list3 = new ArrayList<>();
                    for (String s3 : que3) {
                        if (s3 != null && s3.length() > 0) {
                            list3.add(s3);
                        }
                    }
                    que3 = list3.toArray(new String[0]);
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select a valid index number");
            }
        }else{
            System.out.println("Please select a right queue number");
        }
    }
    public void PCQ(){
        //Delete served customer from a queue
            System.out.print("The customer do want delete in which queue(1/2/3): ");
            int del_served = sc.nextInt();
            if (del_served == 1) {
                try {
                    ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(que1));
                    arrayList1.remove(0);
                    System.out.println("You successfully remove that customer");
                    que1 = arrayList1.toArray(que1);
                    List<String> list1 = new ArrayList<>();
                    for (String s1 : que1) {
                        if (s1 != null && s1.length() > 0) {
                            list1.add(s1);
                        }
                    }
                    que1 = list1.toArray(new String[0]);
                    Fuel_Stock -= 10;
                    if(Fuel_Stock <= 500){
                        System.out.println("Warning! there are low fuel amount in stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            } else if (del_served == 2) {
                try {
                    ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(que2));
                    arrayList2.remove(0);
                    System.out.println("You successfully remove that customer");
                    que2 = arrayList2.toArray(que2);
                    List<String> list2 = new ArrayList<>();
                    for (String s2 : que2) {
                        if (s2 != null && s2.length() > 0) {
                            list2.add(s2);
                        }
                    }
                    que2 = list2.toArray(new String[0]);
                    Fuel_Stock -= 10;
                    if(Fuel_Stock <= 500){
                        System.out.println("Warning! there are low fuel amount in stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            } else if (del_served == 3) {
                try {
                    ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(que3));
                    arrayList3.remove(0);
                    System.out.println("You successfully remove that customer");
                    que3 = arrayList3.toArray(que3);
                    List<String> list3 = new ArrayList<>();
                    for (String s3 : que3) {
                        if (s3 != null && s3.length() > 0) {
                            list3.add(s3);
                        }
                    }
                    que3 = list3.toArray(new String[0]);
                    Fuel_Stock -= 10;
                    if(Fuel_Stock <= 500){
                        System.out.println("Warning! there are low fuel amount in stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else {
                System.out.println("Please select a right queue number");
            }
    }
    public void VCS(){
        //Sorting the queue as alphabetical order
        if(que1.length != 0) {
            String[] q1 = new String[que1.length];//Queue implement from a list
            int a1 = 0;
            for (String i1 : que1) {
                q1[a1] = i1;
                a1++;
            }
            Arrays.sort(q1, String.CASE_INSENSITIVE_ORDER);//Print that list
            System.out.println("This is queue 1: " + Arrays.toString(q1));
        }else{
            System.out.println("The queue 1 is empty");
        }
        if(que2.length != 0) {
            String[] q2 = new String[que2.length];
            int a2 = 0;
            for (String i2 : que2){
                q2[a2] = i2;
                a2++;
            }
            Arrays.sort(q2, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 2: " + Arrays.toString(q2));
        }else{
            System.out.println("The queue 2 is empty");
        }
        if(que3.length != 0) {
            String[] q3 = new String[que3.length];
            int a3 = 0;
            for (String i3 : que3){
                q3[a3] = i3;
                a3++;
            }
            Arrays.sort(q3, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 3: " + Arrays.toString(q3));
        }else{
            System.out.println("The queue 3 is empty");
        }
    }
    public void SPD() throws FileNotFoundException {
        //Store that queue and other data to a files
        PrintWriter out1 = new PrintWriter("Data1.txt");
        PrintWriter out2 = new PrintWriter("Data2.txt");
        PrintWriter out3 = new PrintWriter("Data3.txt");
        PrintWriter outF = new PrintWriter("DataF.txt");
        for(String i1: que1){
            out1.println(i1);//Write values into the file
        }
        for(String i2: que2){
            out2.println(i2);
        }
        for(String i3: que3){
            out3.println(i3);
        }
        outF.println(Fuel_Stock);
        out1.flush();
        out2.flush();
        out3.flush();
        outF.flush();
        out1.close();
        out2.close();
        out3.close();
        outF.close();
        System.out.println("You successfully stored the program data into file");

    }
    public void LPD() throws IOException {
        //Retrieve that queue and other data from a file
        BufferedReader in1 = new BufferedReader(new FileReader("Data1.txt"));
        ArrayList<String> arrayList1 = new ArrayList<>();
        String line1 = in1.readLine();
        while (line1 != null) {
            arrayList1.add(line1);//Read values from files
            line1 = in1.readLine();
        }
        System.out.println("This is queue 1 " + arrayList1);
        que1 = arrayList1.toArray(new String[0]);
        BufferedReader in2 = new BufferedReader(new FileReader("Data2.txt"));
        ArrayList<String> arrayList2 = new ArrayList<>();
        String line2 = in2.readLine();
        while (line2 != null) {
            arrayList2.add(line2);
            line2 = in2.readLine();
        }
        System.out.println("This is queue 2 " + arrayList2);
        BufferedReader in3 = new BufferedReader(new FileReader("Data3.txt"));
        ArrayList<String> arrayList3 = new ArrayList<>();
        String line3 = in3.readLine();
        while (line3 != null) {
            arrayList3.add(line3);
            line3 = in3.readLine();
        }
        System.out.println("This is queue 3 " + arrayList3);
        BufferedReader inF = new BufferedReader(new FileReader("DataF.txt"));
        Fuel_Stock = Double.parseDouble(inF.readLine());
        System.out.println("This is remaining Fuel Stock " + Fuel_Stock);
        in1.close();
        in2.close();
        in3.close();
        inF.close();
        System.out.println("You successfully loaded the program data from file");
    }
    public void STK(){
        //View remaining fuel stock
        System.out.println("Remaining fuel stock is " + Fuel_Stock + " liters");
    }
    public void AFS(Double new_Stock){
        //Add fuel stock
        if(Fuel_Stock + new_Stock > 6600){
            System.out.println("Your fuel stock gone over than 6600 liters");
        } else if (Fuel_Stock + new_Stock <= 6600) {
            Fuel_Stock += new_Stock;
            System.out.println("You successfully added the new stock to fuel stock");
        }else {
            System.out.println("Please enter a valid liter amount");
        }
    }
}

