package org.example;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String customerId;
    private ArrayList<String> rentalRecords;

    Customer(String customerId, String name) {
        this.name = name;
        this.customerId = customerId;
        this.rentalRecords = new ArrayList<String>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCustomerId(){
        return customerId;
    }



    public void addToRentalRecord(Vehicle vehicle){
        if (rentalRecords.contains(vehicle.getVehicleId())){
            System.out.println("Vehicle is already rented");
        }else{
            rentalRecords.add(vehicle.getVehicleId());
            System.out.println("rentalrecord has been added successfully");
        }

    }

    public void removeFromRentalRecord(String vehicleId){
        rentalRecords.remove(vehicleId);
    }

    public ArrayList<String> getRentalRecords(){
        return  rentalRecords;
    }
    public void clearRentalRecords(){
        rentalRecords.clear();
    }
}
