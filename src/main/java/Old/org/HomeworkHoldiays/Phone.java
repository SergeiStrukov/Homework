package Old.org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone extends OfficeEquipment {
    private int screenSize;
    private int storageSize;
    private String operatingSystem;
    private int batteryLife;
    private boolean isSmart;
    private int cameraResolution;
    private String processorType;

    public Phone(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                 int screenSize, int storageSize, String operatingSystem, int batteryLife, boolean isSmart, int cameraResolution, String processorType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
        this.isSmart = isSmart;
        this.cameraResolution = cameraResolution;
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Phone{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                ", screenSize (inches) = " + screenSize +
                ", storageSize (Gb) = " + storageSize +
                ", operatingSystem = '" + operatingSystem + '\'' +
                ", batteryLife (Hours) = " + batteryLife +
                ", isSmart = " + isSmart +
                ", cameraResolution (MGPX) = " + cameraResolution +
                ", processorType = '" + processorType + '\'' +
                '}';
    }
}
