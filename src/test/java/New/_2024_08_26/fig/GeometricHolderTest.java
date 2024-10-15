package New._2024_08_26.fig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GeometricHolderTest {

    //    List<Geometric> geometricList = new ArrayList<>();
    List<Geometric> innerList = HOLDER.getGeometricList();
    Set<Geometric> innerSet = SETHOLDER.getGeometricSet();
    Map<Double, Geometric> innerMap = MAPHOLDER.getGeometricMap();
    private static final GeometricHolder HOLDER = new GeometricHolder();
    private static final GeometricHolder SETHOLDER = new GeometricHolder();
    private static final GeometricHolder MAPHOLDER = new GeometricHolder();

    @BeforeEach
    void setUp() {
        innerList = HOLDER.getGeometricList();
        innerSet = SETHOLDER.getGeometricSet();
        innerMap = MAPHOLDER.getGeometricMap();
        innerList.clear();
        innerSet.clear();
        innerMap.clear();
    }

    @Test
    void addToListPositiveTest() {
        Geometric geometric = new Geometric();
        HOLDER.addToList(geometric);
        assertEquals(1, innerList.size());

    }

    @Test
    void addToSet() {
        Geometric geometric = new Geometric();
        SETHOLDER.addToSet(geometric);
        assertEquals(1, innerSet.size());
    }

    @Test
    void addToMap() {
        Geometric geometric = new Geometric();
        MAPHOLDER.addToMap(1.0, geometric);
        assertEquals(1, innerMap.size());
    }

    @Test
    void getListSize() {
        Geometric geometric = new Geometric();
        HOLDER.addToList(geometric);
        HOLDER.addToList(geometric);
        assertEquals(2, innerList.size());
    }

    @Test
    void addToListShouldThrowExceptionWhenNullIsAdded() {
        Geometric geometric = new Geometric();
        HOLDER.addToList(geometric);
        HOLDER.addToList(geometric);
        assertThrows(ObjectIsNullException.class, () -> HOLDER.addToList(null));

    }

    @Test
    void getSetSize() {
        Geometric geometric = new Geometric();
        SETHOLDER.addToSet(geometric);
        SETHOLDER.addToSet(geometric);
        assertEquals(1,innerSet.size());
    }

    @Test
    void getMapSize() {
        Geometric geometric = new Geometric();
        MAPHOLDER.addToMap(1.0, geometric);
        MAPHOLDER.addToMap(2.0, geometric);
        assertEquals(2, innerMap.size());
    }
}