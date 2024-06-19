package Old.org.Classwork03_05_24Sum.train;

public class Lokomotiv {
    private int id;

    public Lokomotiv(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void getFirstvagon(RollingStock rollingStock) {
        System.out.printf("Lokomotiv %d unhooked vagon %d%n", this.id, rollingStock.unhookFirst().getId());
    }

    public void getLastvagon(RollingStock rollingStock) {
        System.out.printf("Lokomotiv %d unhooked vagon %d%n", this.id, rollingStock.unhookLast().getId());
    }
}
