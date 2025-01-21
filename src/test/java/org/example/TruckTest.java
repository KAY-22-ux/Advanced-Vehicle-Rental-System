package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    public void testTruckRental() {
        // Creating an instance of a truck and customer class
        Truck truck = new Truck("TRUCK001", "HONDA", 800, 500);
        Customer customer = new Customer("CST001", "Kofi Mensah");

        // Test initial availability of the truck
        assertTrue(truck.isAvailableForRental());

        // Test truck rent with customer and days
        truck.rent(customer, 7);
        assertFalse(truck.isAvailableForRental());

        // Test rental cost for 1 WEEK (7 days)
        assertEquals(3500, truck.calculateRentalCost(7));

        // Return the truck and check if it is available for rental
        truck.returnVehicle();
        assertTrue(truck.isAvailableForRental());
    }

    @Test
    public void testTruckRentalWithDiscount() {
        // Creating an instance of a truck and customer class
        Truck truck = new Truck("TRUCK22002", "Man", 600, 500);
        Customer customer = new Customer("CST002", "Ofori Atta");

        // Test initial availability of the truck
        assertTrue(truck.isAvailableForRental());

        // Rent the truck for 10 days with a 15% discount
        truck.rent(customer, 10, 0.15);
        assertFalse(truck.isAvailableForRental());

        // Return the truck and check if it is available for rental
        truck.returnVehicle();
        assertTrue(truck.isAvailableForRental());
    }

    @Test
    public void testToCheckValidTrunkCapacity() {
        // Create an instance of a truck
        Truck truck = new Truck("TRUCK003", "VW", 900, 650);
        assertEquals(900, truck.getTrunkCapacity());
    }
}
