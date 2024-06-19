package Old.org.HomeworkHoldiays;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
