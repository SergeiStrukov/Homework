package Old.org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Monitor extends OfficeEquipment {
    private double screenSize;
    private double resolution;
    private String panelType;
    private int refreshRate;
    private boolean isCurved;
    private String port;
    private boolean isHDR;

    public Monitor(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                   double screenSize, double resolution, String panelType, int refreshRate, boolean isCurved, String port, boolean isHDR) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
        this.isCurved = isCurved;
        this.port = port;
        this.isHDR = isHDR;
    }

    @Override
    public String toString() {
        return "Monitor{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                ", screenSize (inches) = " + screenSize +
                ", resolution = " + resolution +
                ", panelType = '" + panelType + '\'' +
                ", refreshRate = " + refreshRate +
                ", isCurved = " + isCurved +
                ", port = '" + port + '\'' +
                ", isHDR = " + isHDR +
                '}';
    }
}
