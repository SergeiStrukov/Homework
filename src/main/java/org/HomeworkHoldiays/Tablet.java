package org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tablet extends OfficeEquipment {
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
