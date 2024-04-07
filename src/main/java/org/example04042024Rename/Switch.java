package org.example04042024Rename;

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

    public int getPortCount() {
        return portCount;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLayerLvl() {
        return layerLvl;
    }

    public String getManagementType() {
        return managementType;
    }

    public boolean isPowerOverEthernet() {
        return powerOverEthernet;
    }

    public boolean isStackable() {
        return stackable;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setPortCount(int portCount) {
        this.portCount = portCount;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLayerLvl(int layerLvl) {
        this.layerLvl = layerLvl;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public void setPowerOverEthernet(boolean powerOverEthernet) {
        this.powerOverEthernet = powerOverEthernet;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public void setFormFactor(String formFactor) {
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
