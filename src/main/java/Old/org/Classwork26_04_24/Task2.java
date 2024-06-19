package Old.org.Classwork26_04_24;

import java.util.*;

public class Task2 {
    //    Создайте программу для учета оценок студентов. Используйте коллекцию Map, где ключ - это имя студента,
//    а значение - список его оценок. Реализуйте метод для подсчета средней оценки каждого студента.
    public static void main(String[] args) {
        Map<String, List<Double>> nameToMarks = Map.of(
                "Tom", List.of(),
                "Jerry", List.of(5.0, 4.0),
                "Ben", List.of(5.0, 4.0),
                "Max", List.of(5.0, 4.0),
                "Alex", List.of(5.0, 4.0),
                "Alex1", List.of(1.0, 4.0)
        );
        System.out.println(getAverageMark(nameToMarks));
    }

    private static Map<String, Double> getAverageMark(Map<String, List<Double>> nameToMarks) {
        Map<String, Double> nameToAverage = new HashMap<>();
        for (Map.Entry<String, List<Double>> e : nameToMarks.entrySet()) {
            double average = 0;
            for (Double m : e.getValue()) {
                average += m;
            }
//            if (!e.getValue().isEmpty()){
//                average /= e.getValue().size();
//            }
            average = !e.getValue().isEmpty() ? average / e.getValue().size() : 0;
            nameToAverage.put(e.getKey(), average);
        }
        return nameToAverage;
    }
}
