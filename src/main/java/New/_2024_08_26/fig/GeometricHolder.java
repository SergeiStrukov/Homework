package New._2024_08_26.fig;

import java.util.*;

public class GeometricHolder {

    private List<Geometric> geometricList;
    private Set<Geometric> geometricSet;
    private Map<Double, Geometric> geometricMap;

    public GeometricHolder() {
        this.geometricList = new ArrayList<>();
        this.geometricSet = new HashSet<>();
        this.geometricMap = new HashMap<>();
    }


    public void addToList(Geometric geometric) {
        if (geometric == null) {
            throw new ObjectIsNullException("ObjectIsNull");
        }
        geometricList.add(geometric);
    }


    public void addToSet(Geometric geometric) {
        if (geometric == null) {
            throw new ObjectIsNullException("ObjectIsNull");
        }
        geometricSet.add(geometric);
    }


    public void addToMap(Double key, Geometric geometric) {

        geometricMap.put(key, geometric);
    }


    public List<Geometric> getGeometricList() {

        return geometricList;
    }


    public Set<Geometric> getGeometricSet() {

        return geometricSet;
    }


    public Map<Double, Geometric> getGeometricMap() {

        return geometricMap;
    }


    public int getListSize() {
        return geometricList.size();
    }


    public int getSetSize() {

        return geometricSet.size();
    }


    public int getMapSize() {

        return geometricMap.size();
    }
}