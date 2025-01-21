package org.example;

public class RentalTransaction {
    private String transactionId;
    private String customerId;
    private String vehicleId;
    private int daysOfRental;
    private double rentalcost;

    public RentalTransaction(String transactionId, String customerId, String vehicleId, int daysOfRental, double rentalcost) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.daysOfRental = daysOfRental;
        this.rentalcost = rentalcost;
    }

    public String toString() {
        System.out.println("+---+---+---+---+---+---+---+");
        return "Transaction ID: " + transactionId +"\n" +" Customer ID: " + customerId +"\n" + " Vehicle ID: " + vehicleId + "\n" +" Days: " + daysOfRental +"\n" + " Cost: " + rentalcost;
    }
}

