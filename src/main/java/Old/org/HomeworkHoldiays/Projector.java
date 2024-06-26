package Old.org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Projector extends OfficeEquipment {
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
