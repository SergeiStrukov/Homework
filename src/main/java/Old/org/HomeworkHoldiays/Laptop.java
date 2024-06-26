package Old.org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop extends OfficeEquipment {
    private String processorType;
    private int ramSize;
    private double storageSize;
    private double batteryLife;
    private int screenSize;
    private String operatingSystem;
    private boolean isTouchscreen;

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
}
