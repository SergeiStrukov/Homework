package org.Classwork03_05_24Sum.train;

import java.util.ArrayDeque;
import java.util.Deque;

public class RollingStock {
    private Deque<Vagon> vagons;

    public RollingStock() {
        this.vagons = new ArrayDeque<>();
    }

    @Override
    public String toString() {
        return "RollingStock{" +
                "vagons=" + vagons +
                '}';
    }

    public void addFirstVagon(Vagon vagon) {
        vagons.addFirst(vagon);
    }

    public void addLastsVagon(Vagon vagon) {
        vagons.addLast(vagon);
    }

    public Vagon unhookFirst() {
        return vagons.removeFirst();
    }

    public Vagon unhookLast() {
        return vagons.removeLast();
    }

    public boolean isEmpty() {
        return vagons.isEmpty();
    }
}
