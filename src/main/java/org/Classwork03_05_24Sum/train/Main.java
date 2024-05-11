package org.Classwork03_05_24Sum.train;

public class Main {
    public static void main(String[] args) {
        Vagon vagon = new Vagon(1);
        Vagon vagon2 = new Vagon(2);
        Vagon vagon3 = new Vagon(3);
        Vagon vagon4 = new Vagon(4);
        Vagon vagon5 = new Vagon(5);

        RollingStock rollingStock = new RollingStock();
        rollingStock.addLastsVagon(vagon);
        rollingStock.addLastsVagon(vagon2);
        rollingStock.addLastsVagon(vagon3);
        rollingStock.addLastsVagon(vagon4);
        rollingStock.addLastsVagon(vagon5);


        Lokomotiv lokomotiv1 = new Lokomotiv(1);
        Lokomotiv lokomotiv2 = new Lokomotiv(2);

        while (!rollingStock.isEmpty()) {
            lokomotiv1.getFirstvagon(rollingStock);
            if (rollingStock.isEmpty()) break;
            lokomotiv2.getLastvagon(rollingStock);
        }
    }
}
