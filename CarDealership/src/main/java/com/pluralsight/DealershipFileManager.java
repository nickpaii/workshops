package com.pluralsight;

/*

DealershipFileManager will be responsible for reading the dealership file,
parsing the data, and creating a Dealership object full of vehicles from the
file. It will also be responsible for saving a dealership and the vehicles back
into the file in the same pipe-delimited format

*/


public class DealershipFileManager {
    public Dealership getDealership() {

        Dealership dealership = new Dealership("", "", "");
        return dealership;
    }




    public void saveDealership(Dealership dealership) {

    }
}
