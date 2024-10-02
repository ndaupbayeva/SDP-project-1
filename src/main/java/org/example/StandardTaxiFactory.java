package org.example;

public class StandardTaxiFactory extends Factory {
        @Override
        public Taxi createTaxi(String driverName, String license) {
            Driver driver = createDriver(driverName);
            return new StandardTaxi(driverName, license);
        }
    @Override
    public Driver createDriver(String driverName) {
        return new StandardDriver(driverName);
    }
    }
