package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    public void testMotorcycleRental() {
        // Creating an instance of a motorcycle and customer class
        Motorcycle motorcycle = new Motorcycle("MOTO22001", "Quad-Ferrari", 4, 100);
        Customer customer = new Customer("CST001", "Kwame Nkrumah");

        // Test initial availability of the motorcycle
        assertTrue(motorcycle.isAvailableForRental());

        // Test motorcycle rent with customer and days
        motorcycle.rent(customer, 5);
        assertFalse(motorcycle.isAvailableForRental());

        // Test rental cost for 5 days
        assertEquals(500, motorcycle.calculateRentalCost(5));

        // Return the motorcycle and check if it is available for rental
        motorcycle.returnVehicle();
        assertTrue(motorcycle.isAvailableForRental());
    }

    @Test
    public void testMotorcycleRentalWithDiscount() {
        // Creating an instance of a motorcycle and customer class
        Motorcycle motorcycle = new Motorcycle("MOTO22002", "Yamaha M-07", 2, 150);
        Customer customer = new Customer("CST002", "Obetsebi Lamptey");

        // Test initial availability of the motorcycle
        assertTrue(motorcycle.isAvailableForRental());

        // Test for a Rental for motorcycle for 3 days with a 20% discount
        motorcycle.rent(customer, 3, 0.2);
        assertFalse(motorcycle.isAvailableForRental());

        // Return the motorcycle and check if it is available for rental
        motorcycle.returnVehicle();
        assertTrue(motorcycle.isAvailableForRental());
    }

    @Test
    public void testToCheckValidNumberOfWheels() {
        // Create an instance of a motorcycle
        Motorcycle motorcycle = new Motorcycle("MOTO003", "Suzuki", 4, 200);
        assertEquals(4, motorcycle.getNumberOfWheels());
    }
}
