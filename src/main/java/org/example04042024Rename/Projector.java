package org.example04042024Rename;

import com.github.javafaker.Faker;

public class Projector extends OfficeEquipment{
    private int lumens;
    private int resolution;
    private int contrastRatio;
    private int lampLife;
    private int projectionSize;
    private String connectivity;
    private boolean is3DReady;

    public Projector(int id, String modelName, String manufacturer, int yearOfManufacture, double price, double weight, boolean isOperational,
                     int lumens, int resolution, int contrastRatio, int lampLife, int projectionSize, String connectivity, boolean is3DReady) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.lumens = lumens;
        this.resolution = resolution;
        this.contrastRatio = contrastRatio;
        this.lampLife = lampLife;
        this.projectionSize = projectionSize;
        this.connectivity = connectivity;
        this.is3DReady = is3DReady;
    }

    public int getLumens() {
        return lumens;
    }

    public int getResolution() {
        return resolution;
    }

    public int getContrastRatio() {
        return contrastRatio;
    }

    public int getLampLife() {
        return lampLife;
    }

    public int getProjectionSize() {
        return projectionSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public boolean isIs3DReady() {
        return is3DReady;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setContrastRatio(int contrastRatio) {
        this.contrastRatio = contrastRatio;
    }

    public void setLampLife(int lampLife) {
        this.lampLife = lampLife;
    }

    public void setProjectionSize(int projectionSize) {
        this.projectionSize = projectionSize;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void setIs3DReady(boolean is3DReady) {
        this.is3DReady = is3DReady;
    }

    @Override
    public String toString() {
        return "Projector{" + "id = " + getId() +
                ", modelName = '" + getModelName() + '\'' +
                ", manufacturer = '" + getManufacturer() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                ", price = " + getPrice() +
                ", weight (Gr) = " + getWeight() +
                ", isOperational = " + isOperational() +
                " lumens = " + lumens +
                ", resolution = " + resolution +
                ", contrastRatio = " + contrastRatio +
                ", lampLife = " + lampLife +
                ", projectionSize = " + projectionSize +
                ", connectivity = '" + connectivity + '\'' +
                ", is3DReady = " + is3DReady +
                '}';
    }
}
