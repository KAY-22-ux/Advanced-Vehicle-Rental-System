package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalTransactionTest {

    @Test
    public void testRentalTransaction() {
        // Create a rental transaction instance
        RentalTransaction transaction = new RentalTransaction("TXN22001", "CST22001", "CAR22001", 5, 250.00);

        // Verify the transaction details using toString() method
        String expectedTransactionDetails =
                "Transaction ID: TXN22001\n" +
                        " Customer ID: CST22001\n" +
                        " Vehicle ID: CAR22001\n" +
                        " Days: 5\n" +
                        " Cost: 250.0";

        System.out.println(transaction.toString());


        // Test the toString() output
        assertEquals(expectedTransactionDetails, transaction.toString().trim());
    }
}
