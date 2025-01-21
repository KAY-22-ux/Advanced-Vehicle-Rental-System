package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testCarRental() {
        // Creating an instance of a car and customer class
        Car car = new Car("CAR22001", "Toyota Camry", 4, 50);
        Customer customer = new Customer("CST001", "John Agyekum");

        // Test initial availability of the car
        assertTrue(car.isAvailableForRental());

        // Test car rent with customer and days
        car.rent(customer, 5);
        assertFalse(car.isAvailableForRental());

        // Test rental cost
        assertEquals(250, car.calculateRentalCost(5));


        // Return the vehicle and check if it is available for rental
        car.returnVehicle();
        assertTrue(car.isAvailableForRental());
    }
    @Test
    public void testCarRental2() {
        // Create a Tesla car and a Customer object
        Car tesla = new Car("CAR22002", "Model X", 4, 500.00);
        Customer customer2 = new Customer("CST002", "Adjei caleb");

        // Test initial availability of the car
        assertTrue(tesla.isAvailableForRental());  // The car should be available initially

        // Rent the car for 3 days
        tesla.rent(customer2, 3);
        //Check Car availability
        assertFalse(tesla.isAvailableForRental());

        // Return the vehicle and check if it is available for rental
        tesla.returnVehicle();
        assertTrue(tesla.isAvailableForRental());
    }

    @Test
    public void testValidNumberOfDoors() {
        // Create an instance of a car
        Car honda = new Car("CAR002", "Honda Accord", 4, 40);
        assertEquals(4, honda.getNumberOfDoors());
    }
}
