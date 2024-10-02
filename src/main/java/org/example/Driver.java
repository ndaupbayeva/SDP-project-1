package org.example;

public class Driver implements Prototype<Driver> {
    private String name;
    private String carModel;
    private String carMake;
    private String age;
    private String experience;

    public Driver(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    public Driver(String name, String carModel, String carMake) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
    }

    public Driver(String name, String carModel, String carMake, String age) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
        this.age = age;
    }

    public Driver(DriverBuilder driverBuilder) {

    }

    @Override
    public Driver clone() {
        return new Driver(this.name, this.carModel, this.carMake, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public class DriverBuilder {
        private String name;
        private String carModel;
        private String licenseNumber;
        private int experienceYears;
        private boolean isAvailable;

        public DriverBuilder(String name) {
            this.name = name;
        }

        public DriverBuilder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public DriverBuilder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public DriverBuilder setExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public DriverBuilder setIsAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public Driver build() {
            return new Driver(this);
        }
    }

}

