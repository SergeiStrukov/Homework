package org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Scanner extends OfficeEquipment {
    private String scanResolution;
    private int scanSpeed;
    private int colorDepth;
    private String maxPaperSize;
    private String connectivity;
    private boolean isDuplexScanning;
    private String scannerType;

    public Scanner(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                   String scanResolution, int scanSpeed, int colorDepth, String maxPaperSize, String connectivity, boolean isDuplexScanning, String scannerType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.scanResolution = scanResolution;
        this.scanSpeed = scanSpeed;
        this.colorDepth = colorDepth;
        this.maxPaperSize = maxPaperSize;
        this.connectivity = connectivity;
        this.isDuplexScanning = isDuplexScanning;
        this.scannerType = scannerType;
    }

    @Override
    public String toString() {
        return "Scanner{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                "scanResolution='" + scanResolution + '\'' +
                ", scanSpeed=" + scanSpeed +
                ", colorDepth=" + colorDepth +
                ", maxPaperSize='" + maxPaperSize + '\'' +
                ", connectivity='" + connectivity + '\'' +
                ", isDuplexScanning=" + isDuplexScanning +
                ", scannerType='" + scannerType + '\'' +
                '}';
    }
}
