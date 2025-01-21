package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public ArrayList<Integer> numbers;
    public static void main(String[] args) {
        String underscore = "---*---*---*---*---*---*---*---*---*---*---*---*---*---*";

        //Creating  several instances of the cars
        Car car1 = new Car ("CAR001" , "mercedes benz,GLE" , 4, 200.00);
        Car car2 = new Car ("CAR002" , "Toyota corrolla" ,4,  200.00);
        Car car3 = new Car ("CAR003" , "Nissan" , 4, 200.00);
        Car car4 = new Car ("CAR004" , "BMW" , 4, 200.00);
        Car car5 = new Car ("CAR005" , "Honda Accord" ,4,  200.00);



        //Creating  several instances of the motorcycle

        Motorcycle motor1 = new Motorcycle ("MOTOR001" , "boxer" , 2, 200.00);
        Motorcycle motor2 = new Motorcycle ("MOTOR002" , "prado" , 2,200.00);
        Motorcycle motor3 = new Motorcycle ("MOTOR003" , "boxer" , 4, 250.00);
        Motorcycle motor4  = new Motorcycle ("MOTOR004" , "prado" , 4, 200.00);


        //Creating instances of Truck class
        Truck truck1 = new Truck("TRUCK001" , "MAN" , 500 , 1000);
        Truck truck2 = new Truck("TRUCK002" , "LION" , 500 , 1000);
        Truck truck3 = new Truck("TRUCK003" , "SCANIA" , 500 , 1000);



        //Creating instances of customers
        Customer customer1 = new Customer("Adjei caleb" , "CST001");
        Customer customer2 = new Customer("Justice Aboagye" , "CST002");
        Customer customer3 = new Customer("Calvin Adjei" , "CST003");
//
        //Creating a rental agency
        RentalAgency rentalAgency = new RentalAgency ("Kofi rentals");

        //Adding vehicles to the vehicleFleet
        rentalAgency.addToVehicleFleet(car1);
        rentalAgency.addToVehicleFleet(car2);
        rentalAgency.addToVehicleFleet(car3);
        rentalAgency.addToVehicleFleet(car4);
        rentalAgency.addToVehicleFleet(car5);
        rentalAgency.addToVehicleFleet(motor1);
        rentalAgency.addToVehicleFleet(motor2);
        rentalAgency.addToVehicleFleet(motor3);
        rentalAgency.addToVehicleFleet(motor4);
        rentalAgency.addToVehicleFleet(truck1);
        rentalAgency.addToVehicleFleet(truck2);
        rentalAgency.addToVehicleFleet(truck3);



        System.out.println(underscore);
        rentalAgency.processRental(customer1 , car1 , 5 );
        rentalAgency.processRental(customer1 , motor3 , 5);


        rentalAgency.generateReport();
        car1.returnVehicle();
        car1.returnVehicle();
        motor3.getInformation();
        car1.getInformation();

        motor1.getInformation();
        truck1.getInformation();

        RentalTransaction transaction1 = new RentalTransaction( "T001" ,", CST001" ,"MOTOR001" ,5, 200);
        RentalTransaction transaction2 = new RentalTransaction( "T002" ,", CST002" ,"MOTOR002" ,5, 200);
        RentalTransaction transaction3 = new RentalTransaction( "T003" ,", CST003" ,"MOTOR003" ,5, 200);

        System.out.println(transaction1.toString());
















    }
}