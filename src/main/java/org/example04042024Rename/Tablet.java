package org.example04042024Rename;

public class Tablet extends OfficeEquipment{
    private int screenSize;
    private int storageSize;
    private String operatingSystem;
    private int batteryLife;
    private boolean isCellular;
    private int cameraResolution;
    private String processorType;

    public Tablet(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                  int screenSize, int storageSize, String operatingSystem, int batteryLife, boolean isCellular, int cameraResolution, String processorType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
        this.isCellular = isCellular;
        this.cameraResolution = cameraResolution;
        this.processorType = processorType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public boolean isCellular() {
        return isCellular;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setCellular(boolean cellular) {
        isCellular = cellular;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Tablet{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight = " + getWeight() +
                ", isOperational = " + isOperational() +
                ", screenSize (inches) = " + screenSize +
                ", storageSize (GB) = " + storageSize +
                ", operatingSystem = '" + operatingSystem + '\'' +
                ", batteryLife (Hours) = " + batteryLife +
                ", isCellular = " + isCellular +
                ", cameraResolution (MGPX) = " + cameraResolution +
                ", processorType = '" + processorType + '\'' +
                '}';
    }
}
