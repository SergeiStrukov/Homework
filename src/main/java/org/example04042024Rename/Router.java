package org.example04042024Rename;

public class Router extends OfficeEquipment {
    private int speed;
    private int band;
    private String security;
    private int ports;
    private int range;
    private boolean isDualBand;
    private String connectivityType;

    public Router(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                  int speed, int band, String security, int ports, int range, boolean isDualBand, String connectivityType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.speed = speed;
        this.band = band;
        this.security = security;
        this.ports = ports;
        this.range = range;
        this.isDualBand = isDualBand;
        this.connectivityType = connectivityType;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBand() {
        return band;
    }

    public String getSecurity() {
        return security;
    }

    public int getPorts() {
        return ports;
    }

    public int getRange() {
        return range;
    }

    public boolean isDualBand() {
        return isDualBand;
    }

    public String getConnectivityType() {
        return connectivityType;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBand(int band) {
        this.band = band;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDualBand(boolean dualBand) {
        isDualBand = dualBand;
    }

    public void setConnectivityType(String connectivityType) {
        this.connectivityType = connectivityType;
    }

    @Override
    public String toString() {
        return "Router{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                " speed = " + speed +
                ", band = " + band +
                ", security = '" + security + '\'' +
                ", ports = " + ports +
                ", range = " + range +
                ", isDualBand = " + isDualBand +
                ", connectivityType = '" + connectivityType + '\'' +
                '}';
    }
}
