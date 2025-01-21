package org.example;

public class Car extends Vehicle implements Rentable{
    private int numberOfDoors;

    public Car(String vehicleId, String model , int numberOfDoors ,double baseRentalRate ) {
        super(vehicleId, model, baseRentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
            if (numberOfDoors == 4 || numberOfDoors == 2){
                this.numberOfDoors = numberOfDoors;
            }else{
                System.out.println("number of doors must be either 2 or 4");

            }
    }

    @Override
    public double calculateRentalCost(int days){
        if ( days <= 0){
            System.out.println("Days must not be negative");
        }
            return getBaseRentalRate() * days;

    }



    @Override
    public  boolean  isAvailableForRental(){
        return isAvailable();
    }

    @Override
    public void rent(Customer customer , int days){
            if(isAvailableForRental()) {
                setAvailability(false);
                System.out.println("Car has been rented by " + customer.getCustomerId() + ",(" + customer.getName() + ") for " + days + " days at a cost of " + calculateRentalCost(days));
            }else{
                System.out.println("car is unavailable for rental");
            }

    }

    @Override
    public void rent(Customer customer , int days , double discount){
        if(isAvailableForRental()) {
            setAvailability(false);
            double discountedPrice = calculateRentalCost(days) * (1-discount);
            System.out.println("Car has been rented by " + customer.getCustomerId() + ",(" + customer.getName() + ") for " + days + " at a disounted price of " + discountedPrice);
        }else{
            System.out.println("car is unavailable for rental");
        }

    }



    @Override
    public void returnVehicle() {
        if(!isAvailableForRental()  ){
            setAvailability(true);
            System.out.println("vehicle has been returned successfully ");
        }else{
            System.out.println("vehicle is already returned and available for rental");
        }
    }



    public void getInformation(){
        System.out.println("+---+---+---+---+---+---+ ");

        System.out.println("vehicle id: " + getVehicleId() +"\n"+
                "vehicle model: " + getModel() +"\n"+
                "number of Doors:" + getNumberOfDoors()+"\n"+
                "baseRentalRate: " + getBaseRentalRate()+"\n"+
                "isAvalilableForRental: " + isAvailableForRental() +"\n");
    }
}
