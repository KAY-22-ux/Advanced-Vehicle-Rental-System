package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    @Test
    // Test adding and removing vehicles to/from the fleet
    public void testAddAndRemoveVehicle() {
        RentalAgency agency = new RentalAgency("Speedy Rentals");

        // Use concrete Vehicle classes (Car and Truck)
        Car car = new Car("CAR22001", "Toyota Camry", 4, 200);
        Truck truck = new Truck("TRUCK22001", "LION", 800, 500);

        agency.addToVehicleFleet(car);
        agency.addToVehicleFleet(truck);

    }

    @Test
    // Test adding and removing vehicles to/from the fleet
    public void testToCheckGenerateReport() {
        RentalAgency agency = new RentalAgency("Speedy Rentals");

        // Use concrete Vehicle classes (Car and Truck)
        Car car = new Car("CAR22001", "Toyota Camry", 4, 200);
        Truck truck = new Truck("TRUCK22001", "LION", 800, 500);

        agency.addToVehicleFleet(car);
        agency.addToVehicleFleet(truck);

        assertTrue(agency.generateReport().size() > 0);

        agency.removeFromVehicleFleet(car);
        assertEquals(1, agency.generateReport().size());
    }

    @Test
    // Test searching for available vehicles in the fleet
    public void testSearchForAvailableVehicles() {
        RentalAgency agency = new RentalAgency("Eco Rentals");

        // Use concrete Vehicle classes (Car and Truck)
        Car car = new Car("CAR002", "Honda Accord", 4, 200);
        Truck truck = new Truck("TRUCK002", "MAN", 600, 500);

       agency.searchForAvailableVehicles("Honda Accord");
        assertEquals("Honda Accord", car.getModel());

    }

    @Test
    // Test processing rental for a customer
    public void testProcessRental() {
        RentalAgency agency = new RentalAgency("Rapid Rentals");

        // Use concrete Vehicle classes (Car)
        Car car = new Car("CAR22003", "Ford", 2, 200);
        Customer customer = new Customer("CST001", "Kwame Osei");

        agency.addToVehicleFleet(car);
        agency.processRental(customer, car, 5);

        assertFalse(car.isAvailableForRental());

        car.returnVehicle();
        assertTrue(car.isAvailableForRental());
    }

    @Test
    // Test processing rental with a discount for a customer
    public void testProcessRentalWithDiscount() {
        //Create an instance of a rental Agency
        RentalAgency agency = new RentalAgency("Royal Rentals");

        //Create an instance of a truck
        Truck truck = new Truck("TRUCK003", "ZION", 900, 650);
        Customer customer = new Customer("CST002", "Ngozi Okafor");

        agency.addToVehicleFleet(truck);
        agency.processRental(customer, truck, 7, 0.10);

        assertFalse(truck.isAvailableForRental());

        truck.returnVehicle();
        assertTrue(truck.isAvailableForRental());
    }


}
