package New._31_07_24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        Storage<Number> storage = new Storage<>(numbers);


        int number = 11;
        int number2 = 21;
        storage.add(number);
        storage.add(number2);
        storage.add(11.5);

        System.out.println(storage.getStorage());

        try {
            storage.remove(111);
            System.out.println("After removing:" + storage.getStorage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            storage.remove(11);
            System.out.println("After removing:" + storage.getStorage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Element at index 2: " + storage.getObject(2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Element at index 0: " + storage.getObject(0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sum of all numbers: " + storage.sumAllNumbers());
        } catch (EmptyStorageException e) {
            System.out.println(e.getMessage());
        }

        List<Integer> listOfProducers = List.of(4,2,4,2,55);
        storage.addProducerToStorage(listOfProducers);
        System.out.println("Storage after adding producers: " + storage.getStorage());

        List<Number> listOfConsumers = new ArrayList<>(List.of(4,3,2.111111));
        storage.addConsumerToStorage(listOfConsumers);
        System.out.println("listOfConsumers after adding consumers: " + listOfConsumers);
        System.out.println("Storage after adding consumers: " + storage.getStorage());

        Storage <Number> anotherStorage = new Storage<>(new ArrayList<>(List.of(21, 11.5, 4, 2, 4, 2, 55)));
        System.out.println(storage.equals(anotherStorage));
        Storage <Number> anotherStorageTwo = new Storage<>(new ArrayList<>(List.of(21, 11.5, 4, 2)));
        System.out.println(storage.hashCode());
        System.out.println(anotherStorageTwo.hashCode());
    }
}
