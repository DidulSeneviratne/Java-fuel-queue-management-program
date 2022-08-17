package com.example.demo4;

import java.io.*;
import java.util.*;
import java.util.Arrays;
//Called this class as a Passenger class extend
public class FuelQueue extends Main {
    //Introduce scanner object variable
    Scanner sc = new Scanner(System.in);
    CircularQueue CQ = new CircularQueue(6);//Connect with CircularQueue
    public void VFQ(){
        //View all queues
        System.out.println("This is queue 1 " + Que1);
        System.out.println("This is queue 2 " + Que2);
        System.out.println("This is queue 3 " + Que3);
        System.out.println("This is queue 4 " + Que4);
        System.out.println("This is queue 5 " + Que5);
        System.out.println("This is waiting list " + Wait);
    }
    public void VEQ(){
        //View only empty queues
        //Checking queue size
        if(Que1.size()==0 || Que2.size()==0 || Que3.size()==0 || Que4.size()==0 || Que5.size()==0) {
            if (Que1.size()==0) {
                System.out.println("This is queue 1 " + Que1);
            }
            if (Que2.size()==0) {
                System.out.println("This is queue 2 " + Que2);
            }
            if (Que3.size()==0) {
                System.out.println("This is queue 3 " + Que3);
            }
            if (Que4.size()==0) {
                System.out.println("This is queue 4 " + Que4);
            }
            if (Que5.size()==0) {
                System.out.println("This is queue 5 " + Que5);
            }
            if (Wait.size()==0) {
                System.out.println("This is waiting list " + Wait);
            }
        }else{
            System.out.println("No empty Queues");
        }
    }
    public void RCQ(){
        //Delete specific customer from a queue
        System.out.println("This is queue 1 " + Que1);
        System.out.println("This is queue 2 " + Que2);
        System.out.println("This is queue 3 " + Que3);
        System.out.println("This is queue 4 " + Que4);
        System.out.println("This is queue 5 " + Que5);
        System.out.print("The customer do you want delete in which queue:(1/2/3/4/5) ");
        String del_queue = sc.nextLine();
        if(Objects.equals(del_queue, "1")){
            System.out.println("This is queue 1 " + Que1);
            System.out.print("What is the index place of that customer starting from 1-6: ");//Getting queue number
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                        Que1.remove(index_place - 1);//Remove name in queue
                        Fuel1.remove(index_place - 1);//Remove liter value in queue
                        System.out.println("You successfully remove that customer");
                        if (!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);//Empty slot in that replacing by waiting list one
                            Que1.add(pass);
                            CQ.deQueue();
                        }
                        if (FuelW.size() != 0) {
                            Fuel1.add(FuelW.poll());//Empty Fuel liter slot in that replacing by waiting fuel liter value
                        }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "2")) {
            System.out.println("This is queue 2 " + Que2);
            System.out.print("What is the index place of that customer starting from 1-6: ");//Getting queue number
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                        Que2.remove(index_place-1);//Remove name in queue
                        Fuel2.remove(index_place-1);//Remove liter value in queue
                        System.out.println("You successfully remove that customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);//Empty slot in that replacing by waiting list one
                            Que2.add(pass);
                            CQ.deQueue();
                        }
                        if(FuelW.size()!=0) {
                            Fuel2.add(FuelW.poll());//Empty Fuel liter slot in that replacing by waiting fuel liter value
                        }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "3")) {
            System.out.println("This is queue 3 " + Que3);
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                        Que3.remove(index_place-1);
                        Fuel3.remove(index_place-1);
                        System.out.println("You successfully remove that customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que3.add(pass);
                            CQ.deQueue();
                        }
                        if(FuelW.size()!=0) {
                            Fuel3.add(FuelW.poll());
                        }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "4")) {
            System.out.println("This is queue 4 " + Que4);
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                        Que4.remove(index_place-1);
                        Fuel4.remove(index_place-1);
                        System.out.println("You successfully remove that customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que4.add(pass);
                            CQ.deQueue();
                        }
                        if(FuelW.size()!=0) {
                            Fuel4.add(FuelW.poll());
                        }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else if (Objects.equals(del_queue, "5")) {
            System.out.println("This is queue 5 " + Que5);
            System.out.print("What is the index place of that customer starting from 1-6: ");
            int index_place = sc.nextInt();
            if(index_place == 1 || index_place == 2 || index_place == 3 || index_place == 4 || index_place == 5 || index_place == 6) {
                try{
                        Que5.remove(index_place-1);
                        Fuel5.remove(index_place-1);
                        System.out.println("You successfully remove that customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que5.add(pass);
                            CQ.deQueue();
                        }
                        if(FuelW.size()!=0) {
                            Fuel5.add(FuelW.poll());
                        }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }else{
                System.out.println("Please select valid index number");
            }
        } else {
            System.out.println("Please select a right queue number");
        }
    }
    public void PCQ(){
            //Delete served customer from a queue
            System.out.println("This is queue 1 " + Que1);
            System.out.println("This is queue 2 " + Que2);
            System.out.println("This is queue 3 " + Que3);
            System.out.println("This is queue 4 " + Que4);
            System.out.println("This is queue 5 " + Que5);
            System.out.print("The customer do want delete in which queue:(1/2/3/4/5) ");
            String del_served = sc.nextLine();
            if (Objects.equals(del_served, "1")) {
                try {
                    double liters = Fuel1.poll();
                    if (Fuel_Stock >= liters) {
                        Fuel_Stock -= liters;//Getting Fuel liter of customer want and decrease that from Fuel stock
                        Income += liters * Price;
                        if (Fuel_Stock <= 500) {
                            System.out.println("Warning! there are low fuel amount in stock");//If Fuel stock is less warn a message
                        }
                        if(FuelW.size()!=0) {
                            Fuel1.add(FuelW.poll());//Remove that Fuel liter value and adding waiting Fuel liter value
                        }
                        Que1.remove();
                        System.out.println("You successfully remove first customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);//Remove that queue position and adding waiting list one to that queue
                            Que1.add(pass);
                            CQ.deQueue();
                        }
                    } else {
                        System.out.println("Not enough Fuel Stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            } else if (Objects.equals(del_served, "2")) {
                try {
                    double liters = Fuel2.poll();
                    if (Fuel_Stock >= liters) {
                        Fuel_Stock -= liters;
                        Income += liters * Price;
                        if (Fuel_Stock <= 500) {
                            System.out.println("Warning! there are low fuel amount in stock");
                        }
                        if(FuelW.size()!=0) {
                            Fuel2.add(FuelW.poll());
                        }
                        Que2.remove();
                        System.out.println("You successfully remove first customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que2.add(pass);
                            CQ.deQueue();
                        }
                    } else {
                        System.out.println("Not enough Fuel Stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            } else if (Objects.equals(del_served, "3")) {
                try {
                    double liters = Fuel3.poll();
                    if (Fuel_Stock >= liters) {
                        Fuel_Stock -= liters;
                        Income += liters * Price;
                        if (Fuel_Stock <= 500) {
                            System.out.println("Warning! there are low fuel amount in stock");
                        }
                        if(FuelW.size()!=0) {
                            Fuel3.add(FuelW.poll());
                        }
                        Que3.remove();
                        System.out.println("You successfully remove first customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que3.add(pass);
                            CQ.deQueue();
                        }
                    } else {
                        System.out.println("Not enough Fuel Stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            } else if (Objects.equals(del_served, "4")) {
                try {
                    double liters = Fuel4.poll();
                    if (Fuel_Stock >= liters){
                        Fuel_Stock -= liters;
                        Income += liters*Price;
                        if(Fuel_Stock <= 500){
                            System.out.println("Warning! there are low fuel amount in stock");
                        }
                        if(FuelW.size()!=0) {
                            Fuel4.add(FuelW.poll());
                        }
                        Que4.remove();
                        System.out.println("You successfully remove first customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que4.add(pass);
                            CQ.deQueue();
                        }
                    } else {
                        System.out.println("Not enough Fuel Stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            } else if (Objects.equals(del_served, "5")) {
                try {
                    double liters = Fuel5.poll();
                    if (Fuel_Stock >= liters) {
                        Fuel_Stock -= liters;
                        Income += liters * Price;
                        if (Fuel_Stock <= 500) {
                            System.out.println("Warning! there are low fuel amount in stock");
                        }
                        if(FuelW.size()!=0) {
                            Fuel5.add(FuelW.poll());
                        }
                        Que5.remove();
                        System.out.println("You successfully remove first customer");
                        if(!Objects.equals(CQ.displayQueue(), "Empty")) {
                            String pass = Wait.get(0);
                            Que5.add(pass);
                            CQ.deQueue();
                        }
                    } else {
                        System.out.println("Not enough Fuel Stock");
                    }
                }catch (Exception e){
                    System.out.println("Queue already is empty");
                }
            }
            else {
                System.out.println("Please select a right queue number");
            }
    }
    public void VCS(){
        //Sorting the queue as alphabetical order
        if(Que1.size() != 0) {
            String[] q1 = new String[Que1.size()];//Queue implement from a list
            int a1 = 0;
            for (String i1 : Que1) {
                q1[a1] = i1;
                a1++;
            }
            Arrays.sort(q1, String.CASE_INSENSITIVE_ORDER);//Print that list
            System.out.println("This is queue 1: " + Arrays.toString(q1));
        }
        else{
            System.out.println("The queue 1 is empty");
        }
        if(Que2.size() != 0) {
            String[] q2 = new String[Que2.size()];
            int a2 = 0;
            for (String i2 : Que2){
                q2[a2] = i2;
                a2++;
            }
            Arrays.sort(q2, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 2: " + Arrays.toString(q2));
        }
        else{
            System.out.println("The queue 2 is empty");
        }
        if(Que3.size() != 0) {
            String[] q3 = new String[Que3.size()];
            int a3 = 0;
            for (String i3 : Que3){
                q3[a3] = i3;
                a3++;
            }
            Arrays.sort(q3, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 3: " + Arrays.toString(q3));
        }
        else{
            System.out.println("The queue 3 is empty");
        }
        if(Que4.size() != 0) {
            String[] q4 = new String[Que4.size()];
            int a4 = 0;
            for (String i4 : Que4){
                q4[a4] = i4;
                a4++;
            }
            Arrays.sort(q4, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 4: " + Arrays.toString(q4));
        }
        else{
            System.out.println("The queue 4 is empty");
        }
        if(Que5.size() != 0) {
            String[] q5 = new String[Que5.size()];
            int a5 = 0;
            for (String i5 : Que5){
                q5[a5] = i5;
                a5++;
            }
            Arrays.sort(q5, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is queue 5: " + Arrays.toString(q5));
            }
        else{
            System.out.println("The queue 5 is empty");
        }
        if(Wait.size() != 0) {
            String[] qw = new String[Wait.size()];
            int aw = 0;
            for (String iw : Wait){
                qw[aw] = iw;
                aw++;
            }
            Arrays.sort(qw, String.CASE_INSENSITIVE_ORDER);
            System.out.println("This is waiting list: " + Arrays.toString(qw));
        }
        else{
            System.out.println("The waiting list is empty");
        }
    }
    public void SPD() throws FileNotFoundException {
        //Store that queue and other data to a files
        PrintWriter out1 = new PrintWriter("Data1.txt");
        PrintWriter out2 = new PrintWriter("Data2.txt");
        PrintWriter out3 = new PrintWriter("Data3.txt");
        PrintWriter out4 = new PrintWriter("Data4.txt");
        PrintWriter out5 = new PrintWriter("Data5.txt");
        PrintWriter outW = new PrintWriter("DataW.txt");
        PrintWriter outF = new PrintWriter("DataF.txt");
        PrintWriter outF1 = new PrintWriter("Fuel1.txt");
        PrintWriter outF2 = new PrintWriter("Fuel2.txt");
        PrintWriter outF3 = new PrintWriter("Fuel3.txt");
        PrintWriter outF4 = new PrintWriter("Fuel4.txt");
        PrintWriter outF5 = new PrintWriter("Fuel5.txt");
        PrintWriter outFW = new PrintWriter("FuelW.txt");
        for(String i1: Que1){
            out1.println(i1);//Write values into the file
        }
        for(String i2: Que2){
            out2.println(i2);
        }
        for(String i3: Que3){
            out3.println(i3);
        }
        for(String i4: Que4){
            out4.println(i4);
        }
        for(String i5: Que5){
            out5.println(i5);
        }
        for(String iW: Wait){
            outW.println(iW);
        }
        for(double F1: Fuel1){
            outF1.println(F1);
        }
        for(double F2: Fuel2){
            outF2.println(F2);
        }
        for(double F3: Fuel3){
            outF3.println(F3);
        }
        for(double F4: Fuel4){
            outF4.println(F4);
        }
        for(double F5: Fuel5){
            outF5.println(F5);
        }
        for(double FW: FuelW){
            outFW.println(FW);
        }
        outF.println(Fuel_Stock);
        out1.flush();
        out2.flush();
        out3.flush();
        out4.flush();
        out5.flush();
        outW.flush();
        outF.flush();
        outF1.flush();
        outF2.flush();
        outF3.flush();
        outF4.flush();
        outF5.flush();
        outFW.flush();
        out1.close();
        out2.close();
        out3.close();
        out4.close();
        out5.close();
        outW.close();
        outF.close();
        outF1.close();
        outF2.close();
        outF3.close();
        outF4.close();
        outF5.close();
        outFW.close();
        System.out.println("You successfully stored the program data into file");

    }
    public void LPD() throws IOException {
        //Retrieve that queue and other data from a file
        BufferedReader in1 = new BufferedReader(new FileReader("Data1.txt"));
        String line1 = in1.readLine();
        while (line1 != null) {
            que1.add(line1);//Read values from files
            line1 = in1.readLine();
        }
        System.out.println("This is queue 1 " + que1);
        Que1 = que1;
        BufferedReader in2 = new BufferedReader(new FileReader("Data2.txt"));
        String line2 = in2.readLine();
        while (line2 != null) {
            que2.add(line2);
            line2 = in2.readLine();
        }
        System.out.println("This is queue 2 " + que2);
        BufferedReader in3 = new BufferedReader(new FileReader("Data3.txt"));
        String line3 = in3.readLine();
        while (line3 != null) {
            que3.add(line3);
            line3 = in3.readLine();
        }
        System.out.println("This is queue 3 " + que3);
        BufferedReader in4 = new BufferedReader(new FileReader("Data4.txt"));
        String line4 = in4.readLine();
        while (line4 != null) {
            que4.add(line4);
            line4 = in4.readLine();
        }
        System.out.println("This is queue 4 " + que4);
        BufferedReader in5 = new BufferedReader(new FileReader("Data5.txt"));
        String line5 = in5.readLine();
        while (line5 != null) {
            que5.add(line5);
            line5 = in5.readLine();
        }
        System.out.println("This is queue 5 " + que5);
        BufferedReader inW = new BufferedReader(new FileReader("DataW.txt"));
        String lineW = inW.readLine();
        while (lineW != null) {
            Wait.add(lineW);
            lineW = inW.readLine();
        }
        System.out.println("This is waiting list " + Wait);
        BufferedReader inF1 = new BufferedReader(new FileReader("Fuel1.txt"));
        String lineF1 = inF1.readLine();
        while (lineF1 != null) {
            Fuel1.add(Double.parseDouble(lineF1));
            lineF1 = inF1.readLine();
        }
        BufferedReader inF2 = new BufferedReader(new FileReader("Fuel2.txt"));
        String lineF2 = inF2.readLine();
        while (lineF2 != null) {
            Fuel2.add(Double.parseDouble(lineF2));
            lineF2 = inF2.readLine();
        }
        BufferedReader inF3 = new BufferedReader(new FileReader("Fuel3.txt"));
        String lineF3 = inF3.readLine();
        while (lineF3 != null) {
            Fuel3.add(Double.parseDouble(lineF3));
            lineF3 = inF3.readLine();
        }
        BufferedReader inF4 = new BufferedReader(new FileReader("Fuel4.txt"));
        String lineF4 = inF4.readLine();
        while (lineF4 != null) {
            Fuel4.add(Double.parseDouble(lineF4));
            lineF4 = inF4.readLine();
        }
        BufferedReader inF5 = new BufferedReader(new FileReader("Fuel5.txt"));
        String lineF5 = inF5.readLine();
        while (lineF5 != null) {
            Fuel5.add(Double.parseDouble(lineF5));
            lineF5 = inF5.readLine();
        }
        BufferedReader inFW = new BufferedReader(new FileReader("FuelW.txt"));
        String lineFW = inFW.readLine();
        while (lineFW != null) {
            FuelW.add(Double.parseDouble(lineFW));
            lineFW = inFW.readLine();
        }
        BufferedReader inF = new BufferedReader(new FileReader("DataF.txt"));
        Fuel_Stock = Double.parseDouble(inF.readLine());
        System.out.println("This is remaining Fuel Stock " + Fuel_Stock);
        in1.close();
        in2.close();
        in3.close();
        in4.close();
        in5.close();
        inW.close();
        inF.close();
        inF1.close();
        inF2.close();
        inF3.close();
        inF4.close();
        inF5.close();
        inFW.close();
        System.out.println("You successfully loaded the program data from file");
    }
    public void STK(){
        //View remaining fuel stock
        System.out.println("Remaining fuel stock is " + Fuel_Stock + " liters");
    }
    public void AFS(Double new_Stock){
        //Add fuel stock
        if(Fuel_Stock + new_Stock > 6600){//Checking over the limit of stock
            System.out.println("Your fuel stock gone over than 6600 liters");
        } else if (Fuel_Stock + new_Stock <= 6600) {
            Fuel_Stock += new_Stock;
            System.out.println("You successfully added the new stock to fuel stock");
        }
    }
    public void IFS(){
        //View fuel station income
        System.out.println("The income is Rs." + Income);
    }
}

