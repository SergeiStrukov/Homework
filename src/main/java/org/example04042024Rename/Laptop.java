package org.example04042024Rename;

import com.github.javafaker.Faker;

import java.util.Random;

public class Laptop extends OfficeEquipment {
    private String processorType;
    private int ramSize;
    private double storageSize;
    private double batteryLife;
    private int screenSize;
    private String operatingSystem;
    private boolean isTouchscreen;


    public String getProcessorType() {
        return processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean isTouchscreen() {
        return isTouchscreen;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    public Laptop(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                  String processorType, int ramSize, double storageSize, double batteryLife, int screenSize, String operatingSystem, boolean isTouchscreen) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.isTouchscreen = isTouchscreen;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                " processorType = " + processorType + '\'' +
                ", ramSize = " + ramSize + " GB " +
                ", storageSize = " + storageSize + " GB " +
                ", batteryLife = " + batteryLife + " Hours " +
                ", screenSize (inch) = " + screenSize +
                ", operatingSystem = '" + operatingSystem + '\'' +
                ", isTouchscreen = " + isTouchscreen +
                '}';
    }

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();
        System.out.println(" ");
        Laptop laptop = new Laptop(
                faker.number().randomDigit(),
                faker.name().name(),
                faker.company().industry(),
                faker.number().numberBetween(1990, 2024),
                faker.number().numberBetween(1000, 10000),
                faker.number().numberBetween(1000, 10000),
                faker.random().nextBoolean(),
                faker.commerce().productName(),
                faker.number().numberBetween(1, 128),
                faker.number().numberBetween(128, 2048),
                faker.number().randomDouble(2, 4, 10),
                faker.number().numberBetween(10, 18),
                faker.internet().domainName(),
                random.nextBoolean()
        );
        System.out.println(laptop);
    }
}
