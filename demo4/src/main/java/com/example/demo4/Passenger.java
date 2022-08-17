package com.example.demo4;

//Called this class as a main class extend
public class Passenger extends Main {
    CircularQueue CQ = new CircularQueue(6);//Connect with CircularQueue
    //Add customers to the queue checking after queues
    public void ACQ(String fname, String lname, String vehi, double liters){//First checking which queue is fewer customers
        int choice_que = 0;
        if(Que1.size() == Que2.size() && Que2.size() == Que3.size() && Que3.size() == Que4.size() && Que4.size() == Que5.size() && Que1.size() < 6){
            choice_que = 1;
        } else if(Que1.size() > Que2.size() &&  Que2.size() < 6){
            choice_que = 2;
        } else if(Que2.size() > Que3.size() && Que3.size() < 6) {
            choice_que = 3;
        } else if(Que3.size() > Que4.size() && Que4.size() < 6) {
            choice_que = 4;
        } else if(Que4.size() > Que5.size() && Que5.size() < 6) {
            choice_que = 5;
        }
        if(choice_que == 1) {
            Que1.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);//Adding first, second names and vehicle number to the one queue
            Fuel1.add(liters);//Adding liters that customer want to a another liter queue
            System.out.println("Successfully you add to the queue 1");
        } else if (choice_que == 2) {
            Que2.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel2.add(liters);
            System.out.println("Successfully you add to the queue 2");
        } else if (choice_que == 3) {
            Que3.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel3.add(liters);
            System.out.println("Successfully you add to the queue 3");
        } else if (choice_que == 4) {
            Que4.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel4.add(liters);
            System.out.println("Successfully you add to the queue 4");
        } else if (choice_que == 5) {
            Que5.add(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            Fuel5.add(liters);
            System.out.println("Successfully you add to the queue 5");
        } else{
            System.out.println("All the queue are full fill");
            CQ.enQueue(fname + " " + lname + " " + "Vehi No:" + " " + vehi);
            FuelW.add(liters);//Use Circular class method
            System.out.println("Successfully you add to the waiting list");
        }
    }
}
