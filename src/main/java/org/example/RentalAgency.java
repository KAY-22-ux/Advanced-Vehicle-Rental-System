package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private String agencyName;
    private final ArrayList<Vehicle> vehicleFleet;
    private final List<Customer> customers;


    //Constructor to create an instance of a Rental agency
    public RentalAgency(String name) {
        this.agencyName = name;
        vehicleFleet = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    //Method to add a vehicle to vehicle Fleet
    public void addToVehicleFleet(Vehicle vehicle){
        vehicleFleet.add(vehicle);
        System.out.println(vehicle.getVehicleId() + ", " + vehicle.getModel() + " has been added to garage");
    }


    //Method to remove vehicle from vehicle fleet
    public  void removeFromVehicleFleet(Vehicle vehicle){
        vehicleFleet.remove(vehicle);
        System.out.println(vehicle.getVehicleId() + ", " + vehicle.getModel() + " has been removed from garage");
    }


    //Method to search for a vehicle from the vehicle fleet
    public  Vehicle searchForAvailableVehicles(String model){
        for(Vehicle vehicle : vehicleFleet){
            if(vehicle.isAvailable() && vehicle.getModel().equals(model)){
                return vehicle;
            }
        }
        return null;
    }


    //Method to process rent for a customer
    public void processRental(Customer customer, Vehicle vehicle  ,  int days) {
        if (vehicle.isAvailableForRental()) {
                if (vehicle instanceof Rentable rentableVehicle ) {
                    rentableVehicle.rent(customer, days);
                    customer.addToRentalRecord(vehicle);
                }

        }else{
            System.out.println("vehicle is not available for rental");
        }
    }


    //Rent vehicle to customer with discount
    public void processRental(Customer customer, Vehicle vehicle  ,  int days, double discount) {
        if (vehicle.isAvailableForRental()) {
            if (vehicle instanceof Rentable rentableVehicle ) {
                rentableVehicle.rent(customer, days , discount);
                customer.addToRentalRecord(vehicle);
                double discountedPrice = vehicle.calculateRentalCost(days) * (1 - discount);
            }
        }else{
            System.out.println("vehicle is not available for rental");
        }
    }



    //Generate report and  list vehicles in vehicle fleet
    public ArrayList<Vehicle> generateReport(){
        System.out.println("+---+---+---+---+---+---+---+---+---+---+");
        System.out.println("RENTAL AGENCY REPORT");
        System.out.println("Rental Agenct Name: " + getAgencyName());
        System.out.println("vehicles in garage: "+ vehicleFleet.size() + "\n");

        int counter = 1;
        for(Vehicle vehicle : vehicleFleet){
            System.out.println(counter + "." + "vehicleId: "+vehicle.getVehicleId()+"  vehicle model: "+vehicle.getModel()+"  rate: "+vehicle.getBaseRentalRate());
            counter++;
        }
        return vehicleFleet;
    }


    //Method to list vehicles available for rental
    public ArrayList<Vehicle> availableForRental(){
        int counter = 1;
        System.out.println("VEHICLES AVAILABLE FOR RENTAL");
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailableForRental()) {
                System.out.println("vehicleId: " +vehicle.getVehicleId()+ "  model: "+ vehicle.getModel()+ "   rate: "+vehicle.getBaseRentalRate());
            }
        }
        return null;
    }







}
