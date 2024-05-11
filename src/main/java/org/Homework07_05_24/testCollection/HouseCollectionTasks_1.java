package org.Homework07_05_24.testCollection;

import java.util.*;

public class HouseCollectionTasks_1 {

    // Задание 1: Вернуть список всех квартир во всех домах (List)//
    public static List<Flat> getAllFlats(List<House> houses) {
        List<Flat> allFlats = new ArrayList<>();
        for (House house : houses) {
            List<Flat> flatslist = house.flats;
            for (Flat flat : flatslist) {
                allFlats.add(flat);
            }
        }
        return allFlats;
    }

    // Задание 2: Вернуть множество всех уникальных цветов, используемых в комнатах квартир (Set)
    public static Set<Color> getUniqueRoomColors(List<House> houses) {
        Set<Color> colors = new HashSet<>();
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    colors.add(room.color);
                }
            }
        }
        return colors;
    }

    // Задание 3: Вернуть карту, ключами которой являются номера этажей, а значениями - количество квартир на этом этаже (Map)
    public static Map<Integer, Integer> getFlatsCountByFloor(House houses) {
        Map<Integer, Integer> floorToFlatCount = new HashMap<>();
        for (Flat flat : houses.flats) {
            if (floorToFlatCount.containsKey(flat.floor)) {
                int count = floorToFlatCount.get(flat.floor) + 1;
                floorToFlatCount.put(flat.floor, count);
            } else {
                floorToFlatCount.put(flat.floor, 1);
            }
        }
        return floorToFlatCount;
    }

    // Задание 4: Используя очередь, вернуть список номеров квартир в порядке, в котором они появляются, начиная с первого подъезда (Queue)
    public static List<Integer> getFlatNumbersInOrder(House houses) {
//        Queue<Integer> queue = new LinkedList<>();
//        List<Integer> orderedFlatNumbers = new ArrayList<>();
        Queue<Flat> flatQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.flatnumber));
        flatQueue.addAll(houses.flats);
        List<Integer> orderedFlatNumbers = new ArrayList<>();
        while (!flatQueue.isEmpty()) {
            orderedFlatNumbers.add(flatQueue.poll().flatnumber);
        }
        return orderedFlatNumbers;
    }

    // Задание 5: Используя стек, вернуть список всех квартир в обратном порядке от последнего дома к первому (Stack)
    public static List<Flat> getFlatsInReverseOrder(House houses) {
        Stack<Flat> stack = new Stack<>();
//        houses.flats.forEach(flat -> stack.push(flat));
        for (Flat flat : houses.flats) {
            stack.push(flat);
        }
        List<Flat> flatList = new ArrayList<>();
        while (!stack.isEmpty()) {
            flatList.add(stack.pop());
        }
        return new ArrayList<>(stack);
    }

    public static void main(String[] args) {
        List<House> houses = HouseGenerator.generateHouses(1);

//        System.out.println("Все квартиры: " + getAllFlats(houses).size());
//        System.out.println("Уникальные цвета комнат: " + getUniqueRoomColors(houses).size());
//        System.out.println("Квартиры по этажам: " + getFlatsCountByFloor(houses.get(0)));
//        System.out.println("Номера квартир по порядку: " + getFlatNumbersInOrder(houses.get(0)));
        System.out.println("Квартиры в обратном порядке: " + getFlatsInReverseOrder(houses.get(0)));
    }
}
