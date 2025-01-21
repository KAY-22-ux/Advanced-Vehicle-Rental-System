package org.example;

public class Motorcycle extends Vehicle implements Rentable{
    private int numberOfWheels;

    public Motorcycle(String vehicleId, String model , int numberOfWheels , double baseRentalRate ) {
        super(vehicleId, model, baseRentalRate);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels == 4 || numberOfWheels == 2){
            this.numberOfWheels = numberOfWheels;
        }else{
            System.out.println("number of wheels must be either 2 or 4");

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
            System.out.println("Motorcycle has been rented by " + customer.getCustomerId() + ",(" + customer.getName() + ") for " + days + " days at a cost of " + calculateRentalCost(days));
        }else{
            System.out.println("Motorcycle is unavailable for rental");
        }

    }

    @Override
    public void rent(Customer customer , int days , double discount){
        if(isAvailableForRental()) {
            setAvailability(false);
            double discountedPrice = calculateRentalCost(days) * (1-discount);
            System.out.println("Motorcycle has been rented by " + customer.getCustomerId() + ",(" + customer.getName() + ") for " + days + " at a disounted price of " + discountedPrice);
        }else{
            System.out.println("Motorcycle is unavailable for rental");
        }

    }



    @Override
    public void returnVehicle() {
        if(!isAvailableForRental()  ){
            setAvailability(true);
            System.out.println("Motorcycle has been returned successfully ");
        }else{
            System.out.println("Motorcycle is already returned and available for rental");
        }
    }



    public void getInformation(){
        System.out.println("+---+---+---+---+---+---+");
        System.out.println("vehicle id: " + getVehicleId() +"\n"+
                "vehicle model: " + getModel() +"\n"+
                "number of wheels: " + getNumberOfWheels() +"\n"+
                "baseRentalRate: " + getBaseRentalRate()+"\n"+
                "Availability: " + isAvailableForRental() +"\n");
    }
}
