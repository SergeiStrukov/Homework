package org.example04042024Rename;

public class Printer extends OfficeEquipment {
    private String printTechnology;
    private int printSpeed;
    private int maxResolution;
    private String isColor;
    private double paperSize;
    private String connectivity;
    private int dutyCycle;

    public Printer(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                   String printTechnology, int printSpeed, int maxResolution, String isColor, double paperSize, String connectivity, int dutyCycle) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.printTechnology = printTechnology;
        this.printSpeed = printSpeed;
        this.maxResolution = maxResolution;
        this.isColor = isColor;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.dutyCycle = dutyCycle;
    }

    public String getPrintTechnology() {
        return printTechnology;
    }

    public int getPrintSpeed() {
        return printSpeed;
    }

    public int getMaxResolution() {
        return maxResolution;
    }

    public String getIsColor() {
        return isColor;
    }

    public double getPaperSize() {
        return paperSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public int getDutyCycle() {
        return dutyCycle;
    }

    public void setPrintTechnology(String printTechnology) {
        this.printTechnology = printTechnology;
    }

    public void setPrintSpeed(int printSpeed) {
        this.printSpeed = printSpeed;
    }

    public void setMaxResolution(int maxResolution) {
        this.maxResolution = maxResolution;
    }

    public void setIsColor(String isColor) {
        this.isColor = isColor;
    }

    public void setPaperSize(double paperSize) {
        this.paperSize = paperSize;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void setDutyCycle(int dutyCycle) {
        this.dutyCycle = dutyCycle;
    }

    @Override
    public String toString() {
        return "Printer{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                " printTechnology = '" + printTechnology + '\'' +
                ", printSpeed (char per second) =  " + printSpeed +
                ", maxResolution = " + maxResolution +
                ", isColor = '" + isColor + '\'' +
                ", paperSize A: " + paperSize +
                ", connectivity = '" + connectivity + '\'' +
                ", dutyCycle = " + dutyCycle +
                '}';
    }
}
