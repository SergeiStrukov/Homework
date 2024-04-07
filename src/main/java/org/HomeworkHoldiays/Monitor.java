package org.HomeworkHoldiays;

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

    public double getScreenSize() {
        return screenSize;
    }

    public double getResolution() {
        return resolution;
    }

    public String getPanelType() {
        return panelType;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public String getPort() {
        return port;
    }

    public boolean isHDR() {
        return isHDR;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setHDR(boolean HDR) {
        isHDR = HDR;
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
