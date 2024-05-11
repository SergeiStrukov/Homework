package org.Homework07_05_24.testCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdvancedHouseCollectionTasks {

    // Задание 1: Вернуть список номеров квартир, у которых количество комнат больше среднего кол-ва комнат по всем квартирам каждого дома (List)
    //
    public static List<Integer> getFlatsWithMoreRoomsThanAverage(List<House> houses) {
        List<Integer> flatNumbers = new ArrayList<>();

        return flatNumbers;
    }

    // Задание 2: Вернуть список этажей, на которых есть лифт (List и Set для исключения повторений)
    public static List<Integer> getFloorsWithElevator(List<House> houses) {
        Set<Integer> floorsWithElevator = new HashSet<>();
        for (House house : houses) {
            if (house.hasElevator) {
                floorsWithElevator.addAll(getFloorNumbers(house));
            }
        }
        return new ArrayList<>(floorsWithElevator);
    }

    private static Set<Integer> getFloorNumbers(House house) {
        Set<Integer> floors = new HashSet<>();
        for (Flat flat : house.flats) {
            floors.add(flat.floor);
        }
        return floors;
    }

    // Задание 3: Подсчитать общее количество подъездов в домах, которые имеют больше 100 квартир (List)
    public static int getTotalEntrancesInLargeHouses(List<House> houses) {
        int totalEntrances = 0;
        for (House house : houses) {
            if (house.flats.size() > 100) {
                totalEntrances += house.entrance;
            }
        }
        return totalEntrances;
    }

    // Задание 4: Определить, все ли дома имеют лифт (List)
    public static boolean areAllHousesWithElevator(List<House> houses) {
        for (House house : houses) {
            if (!house.hasElevator) return false;
        }
        return true;
    }

    // Задание 5: Подсчитать общее количество квартир, расположенных на первом этаже (List)
    public static int getTotalFirstFloorFlats(List<House> houses) {
        int count = 0;
        for (House house : houses) {
            for (Flat flat : house.flats) {
                if (flat.floor == 1) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<House> houses = HouseGenerator.generateHouses(2); // Генерируем дома для примера
//        houses.forEach(house -> System.out.println(house));
        System.out.println(getTotalFirstFloorFlats(houses));
    }
}