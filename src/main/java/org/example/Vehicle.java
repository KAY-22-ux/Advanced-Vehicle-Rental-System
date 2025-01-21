package org.example;

public abstract class  Vehicle {

    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {

        return baseRentalRate;
    }


    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0){
            System.out.println("BaseRate must be a positive number");
        }else{
        this.baseRentalRate = baseRentalRate;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean available) {
        this.isAvailable = available;
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();


    public String VehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model +
                ", Base Rate: " + baseRentalRate +", Available: " + isAvailable;
    }



}






