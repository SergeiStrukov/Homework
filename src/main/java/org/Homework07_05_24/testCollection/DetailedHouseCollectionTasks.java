package org.Homework07_05_24.testCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetailedHouseCollectionTasks {

    // Задание 1: Вернуть список всех коробок, вес которых больше среднего веса всех коробок (List)
    public static List<Box> getBoxesHeavierThanAverage(List<House> houses) {
        List<Box> boxesWeightAverage = new ArrayList<>();
        double averageWeight = 0;
        double allBoxesWeight = 0;
        double boxes = 0;
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    for (Box box : room.boxes) {
                        allBoxesWeight += box.weight;
                        boxes++;
                    }
                }
            }
        }
        if (boxes == 0) {
            return boxesWeightAverage;
        }
        averageWeight = allBoxesWeight / boxes;
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    for (Box box : room.boxes) {
                        if (box.weight > averageWeight) {
                            boxesWeightAverage.add(box);
                        }
                    }
                }
            }
        }
        return boxesWeightAverage;
    }

    // Задание 2: Вернуть карту, где ключи — это цвета коробок, а значения — количество комнат, содержащих хотя бы одну коробку такого цвета (List, Map)
//    public static Map<Color, Integer> getRoomCountByBoxColor(List<House> houses) {
//        Map<Color, Integer> roomCountByColor = new HashMap<>();
////         Map<Color, Set<Room>> roomsWithBoxesByColor = new HashMap<>();
//        for (House house : houses) {
//            for (Flat flat : house.flats) {
//                for (Room room : flat.roomList) {
//                    roomCountByColor.put()
//                    for (Box box : room.boxes) {
//                        boxCountByColor.put(box.color, boxCountByColor.getOrDefault(box.color, 0) + 1);
//                    }
//                }
//            }
//        }
//        return roomCountByColor;
//    }

    // Задание 3: Найти средний вес коробок в комнатах с зелеными стенами (List)
    public static double getAverageWeightOfBoxesInGreenRooms(List<House> houses) {
        double totalWeight = 0;
        double boxCount = 0;
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    if (room.color == Color.GREEN) {
                        for (Box box : room.boxes) {
                            totalWeight += box.weight;
                            boxCount++;
                        }
                    }
                }
            }
        }
        if (boxCount == 0) {
            return boxCount;
        }
        return boxCount > 0 ? totalWeight / boxCount : 0;
    }

    // Задание 4: Определить, в каком доме самый большой процент квартир с коробками (List)
    public static House getHouseWithHighestPercentageOfFlatsWithBoxes(List<House> houses) {
        House houseWithHighestPercentage = null;
        double highestPercentRoomBoxes = 0;
        for (House house : houses) {
            double flatWithBoxes = 0;
            double percentRoomBoxes = 0;
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    if (!room.boxes.isEmpty()) {
                        flatWithBoxes++;
                        break;
                    }
                }
            }
            if (house.flats.size() == 0) {
                continue; // Если нет квартир в доме, переходим к следующему дому
            }
            percentRoomBoxes = flatWithBoxes / house.flats.size() * 100;
            if (percentRoomBoxes > highestPercentRoomBoxes) {
                highestPercentRoomBoxes = percentRoomBoxes;
                houseWithHighestPercentage = house;
            }
        }
        return houseWithHighestPercentage;
    }

    // Задание 5: Подсчитать количество квартир, которые находятся в домах без лифтов и содержат коробки (List)
    public static int countFlatsWithBoxesInHousesWithoutElevators(List<House> houses) {
        int count = 0;

        return count;
    }

    public static void main(String[] args) {
        List<House> houses = HouseGenerator.generateHouses(10);

//        System.out.println("Коробки тяжелее среднего: " + getBoxesHeavierThanAverage(houses).size());
//        System.out.println("Количество комнат по цветам коробок: " + getRoomCountByBoxColor(houses));
//        System.out.println("Средний вес коробок в зеленых комнатах: " + getAverageWeightOfBoxesInGreenRooms(houses));
        System.out.println("Дом с самым большим процентом квартир с коробками: " + getHouseWithHighestPercentageOfFlatsWithBoxes(houses));
//        System.out.println("Квартиры с коробками в домах без лифтов: " + countFlatsWithBoxesInHousesWithoutElevators(houses));
    }
}