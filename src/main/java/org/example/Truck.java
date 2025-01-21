package org.example;

public class Truck extends Vehicle implements Rentable{
    private int trunkCapacity;

    public Truck(String vehicleId, String model , int trunkCapacity , double baseRentalRate ) {
        super(vehicleId, model, baseRentalRate);
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        if (trunkCapacity > 200 && trunkCapacity < 1000){
            this.trunkCapacity = trunkCapacity;
        }else{
            System.out.println("Trunk capacity should range between 200 and 1000");

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
            System.out.println("Truck has been rented by " + customer.getCustomerId() + ",(" + customer.getName() + ") for " + days + " days at a cost of " + calculateRentalCost(days));
        }else{
            System.out.println("Truck is unavailable for rental");
        }

    }

    @Override
    public void rent(Customer customer , int days , double discount){
        if(isAvailableForRental()) {
            setAvailability(false);
            double discountedPrice = calculateRentalCost(days) * (1-discount);
            System.out.println("Truck has been rented by " + customer.getCustomerId() + ",(" + customer.getName() + ") for " + days + " days  at a disounted price of " + discountedPrice);
        }else{
            System.out.println("Truck is unavailable for rental");
        }

    }



    @Override
    public void returnVehicle() {
        if(!isAvailableForRental()  ){
            setAvailability(true);
            System.out.println("Truck has been returned successfully ");
        }else{
            System.out.println("Truck is already returned and available for rental");
        }
    }



    public void getInformation(){
        System.out.println("+---+---+---+---+---+---+ ");
        System.out.println("vehicle id: " + getVehicleId() +"\n"+
                "vehicle model: " + getModel() +"\n"+
                "Trunk Capacity: " + getTrunkCapacity() +"\n"+
                "baseRentalRate: " + getBaseRentalRate()+"\n"+
                "Availability: " + isAvailableForRental() +"\n");
    }
}
