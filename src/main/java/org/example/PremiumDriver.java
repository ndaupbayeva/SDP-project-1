package org.example;

public class PremiumDriver extends Driver {
    public PremiumDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driver with comfort");
    }
}
