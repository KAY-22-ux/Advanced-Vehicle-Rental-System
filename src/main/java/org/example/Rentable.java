package org.example;

public interface Rentable  {
    void rent(Customer customer, int days);
    void rent(Customer customer , int days , double discount);

    void returnVehicle();
}
