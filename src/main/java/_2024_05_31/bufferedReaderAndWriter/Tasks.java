package _2024_05_31;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Tasks {

    //    !!!Прочитайте файл и посчитайте средний рейтинг всех стримов. Запишите результат в новый файл.
    //Отфильтруйте стримы, имеющие рейтинг выше 4.5, и запишите их в новый файл.
    public static Map<String, List<Double>> streamsToRatings = new HashMap<>();


    public static void main(String[] args) {
        // Тестовые вызовы методов
//        keyGetter("1: [Стрим 1], 4.0");
//        valueGetter("1: [Стрим 1], 4.0");
        read();
        writeAverageRating();
        writeFilteredStreamsHigher();
        writeFilteredStreamsHigher();
        writeSameNameStreams();
//        System.out.println(groupedStreams());
//        System.out.println(getAvgRating());
        writeSortedByRatesStreams();
    }

    public static void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String key = keyGetter(line);
                Double value = valueGetter(line);
                if (key != null && value != null) {
                    List<Double> list = streamsToRatings.getOrDefault(key, new ArrayList<>());
                    list.add(value);
                    streamsToRatings.put(key, list);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeAverageRating() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("avg.txt"))) {
            writer.write("AVG: " + getAvgRating());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFilteredStreamsHigher() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("highStreams.txt"))) {
            writer.write("highRatingStreams:" + filteredStreamsHigher());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeSameNameStreams() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("writeSameNameStreams.txt"))) {
            Map<String, Integer> groupedStreams = groupedStreams();
            for (Map.Entry<String, Integer> entry : groupedStreams.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeSortedByRatesStreams() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("writeSortedByRatesStreams.txt"))) {
            writer.write("writeSortedByRatesStreams:" + sortedByRatesStreams());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // Для извлечения значения
    private static Double valueGetter(String line) {

        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group());
            return Double.parseDouble(matcher.group());
        }
        return null;
    }

    // Метод для извлечения ключа
    private static String keyGetter(String line) {
        Pattern pattern = Pattern.compile("\\d+:\\s*\\[([^]]+)\\]");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            return matcher.group(1);
        }
        return null;
    }

    public static Double getAvgRating() {
        return streamsToRatings
                .entrySet()
                .stream()
                .flatMap(el -> el.getValue().stream())
                .mapToDouble(el -> el)
                .average()
                .orElse(0.0);
    }

    //Отфильтруйте стримы, имеющие рейтинг выше 4.5
    public static Map<String, Double> filteredStreamsHigher() {
        Map<String, Double> averageStreams = streamsToRatings
                .entrySet().stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        value -> value.getValue().stream()
                                .mapToDouble(el -> el.doubleValue())
                                .average()
                                .getAsDouble()));

        return averageStreams
                .entrySet()
                .stream()
                .filter(el -> el.getValue() > 4.5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    //    Сгруппируйте стримы по названию и запишите количество стримов в каждой группе в новый файл. Группировка есть
    public static Map<String, Integer> groupedStreams() {
        Map<String, Integer> groupedStreams = streamsToRatings
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        el -> el.getValue().size()));
        return groupedStreams;
    }

    //Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.
    public static Map<String, Double> sortedByRatesStreams() {
        return streamsToRatings.entrySet().stream()
                .collect(Collectors.toMap(key -> key.getKey(), entry -> entry.getValue().stream()
                        .mapToDouble(el -> el)
                        .average()
                        .orElse(0.0)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }
}
