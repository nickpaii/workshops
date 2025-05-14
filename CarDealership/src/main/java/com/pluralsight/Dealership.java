package com.pluralsight;

import java.util.ArrayList;

/*

Dealership will hold information about the dealership (name, address, ...)
and maintain a list of vehicles. Since it has the list of vehicles, it will also
have the methods that search the list for matching vehicles as well as
add/remove vehicles.

*/

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String phoneNumber, String address) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make,  String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return null;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
}
