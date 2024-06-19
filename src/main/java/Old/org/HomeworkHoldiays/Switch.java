package Old.org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Switch extends OfficeEquipment {
    private int portCount;
    private int speed;
    private int layerLvl; // 1-4
    private String managementType;
    private boolean powerOverEthernet;
    private boolean stackable;
    private String formFactor;

    public Switch(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                  int portCount, int speed, int layerLvl, String managementType, boolean powerOverEthernet, boolean stackable, String formFactor) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.portCount = portCount;
        this.speed = speed;
        this.layerLvl = layerLvl;
        this.managementType = managementType;
        this.powerOverEthernet = powerOverEthernet;
        this.stackable = stackable;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Switch{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                " portCount = " + portCount +
                ", speed = " + speed +
                ", layerLvl = " + layerLvl +
                ", managementType = '" + managementType + '\'' +
                ", powerOverEthernet = " + powerOverEthernet +
                ", stackable = " + stackable +
                ", formFactor = '" + formFactor + '\'' +
                '}';
    }
}
