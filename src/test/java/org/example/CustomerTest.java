package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    public void testAddToRentalRecord() {
        // Create vehicle instances
        Car car = new Car("CAR22001", "Toyota", 4, 200);
        Truck truck = new Truck("TRK22002", "Ford", 500, 500);
        Customer customer = new Customer("CST22001", "Kwame Osei");

        // Add vehicles to rental record
        customer.addToRentalRecord(car);
        customer.addToRentalRecord(truck);

        // Check if rental records have been added
        assertTrue(customer.getRentalRecords().contains("CAR22001"));
        assertTrue(customer.getRentalRecords().contains("TRK22002"));
    }

    @Test
    public void testRemoveFromRentalRecord() {
        // Create vehicle and customer instances
        Car car = new Car("CAR22001", "Ford", 2, 200);
        Customer customer = new Customer("CST22002", "Ama Asante");

        // Add car to rental record
        customer.addToRentalRecord(car);

        // Remove car from rental record and verify it's removed
        customer.removeFromRentalRecord("CAR22001");
        assertFalse(customer.getRentalRecords().contains("CAR22001"));
    }

    @Test
    public void testClearRentalRecords() {
        // Create vehicle and customer instances
        Car car = new Car("CAR22001", "Toyota", 4, 250);
        Truck truck = new Truck("TRK22002", "Ford", 500, 350);
        Customer customer = new Customer("CST22003", "Kofi Agyemang");

        // Add vehicles to rental record
        customer.addToRentalRecord(car);
        customer.addToRentalRecord(truck);

        // Clear rental records
        customer.clearRentalRecords();
        assertTrue(customer.getRentalRecords().isEmpty());
    }
}
