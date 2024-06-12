package _2024_06_05.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        // Создание объекта Path для существующего файла
        Path filePath = Paths.get("wp.txt");
        
        // Получение информации о пути
        System.out.println("Имя файла: " + filePath.getFileName());
        System.out.println("Родительская директория: " + filePath.getParent());
        System.out.println("Абсолютный путь: " + filePath.toAbsolutePath());
        
        // Навигация по пути
        Path subPath = filePath.subpath(0, 2);
        System.out.println("Подпуть: " + subPath);
        
        // Проверка существования файла
        boolean exists = Files.exists(filePath);
        System.out.println("Файл существует: " + exists);
        
        // Создание нового файла
        Path newFilePath = Paths.get("C:\\myfolder\\newfile.txt");
        try {
            Files.createFile(newFilePath);
            System.out.println("Новый файл создан.");
        } catch (IOException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
        }
        
        // Удаление файла
        try {
            Files.delete(newFilePath);
            System.out.println("Файл удален.");
        } catch (IOException e) {
            System.out.println("Не удалось удалить файл: " + e.getMessage());
        }
    }
}

/**
 * Класс Path в Java представляет собой абстракцию пути
 * к файлу или директории в файловой системе. Он предоставляет
 * методы для работы с путями, включая создание, получение
 * информации о пути, навигацию, поиск и многое другое.
 * Класс Path является частью пакета java.nio.file, введенного
 * в Java 7, который предоставляет более удобные возможности
 * для работы с файлами и директориями.
 *
 *
 * Основные методы класса Path:
 *
 * getFileName(): Возвращает имя файла или последний компонент пути.
 * getParent(): Возвращает родительскую директорию пути или null,
 * если родительская директория не определена.
 * toAbsolutePath(): Возвращает абсолютный путь к файлу или директории.
 * subpath(int beginIndex, int endIndex): Возвращает подпуть,
 * содержащий компоненты пути от beginIndex до endIndex.
 * Files.exists(Path path): Проверяет существование файла или директории.
 * Files.createFile(Path path): Создает новый файл по заданному пути.
 * Files.delete(Path path): Удаляет файл или директорию.
 *
 * Работа с файлами и директориями:
 * Класс Path предоставляет методы для создания, удаления,
 * перемещения и переименования файлов и директорий.
 * Он упрощает выполнение таких операций, так как позволяет
 * работать с путями, а не только с именами файлов.
 *
 * Навигация по файловой системе:
 * Класс Path позволяет получать информацию о
 * родительской директории, имени файла, абсолютном
 * пути и других компонентах пути. Это полезно для навигации по
 * директориям и выполнения операций на основе расположения файлов.
 *
 * Работа с множеством операций:
 * Класс Path поддерживает методы для комбинирования путей,
 * разрешения относительных путей, нормализации путей и
 * преобразования пути в URI. Это особенно полезно при выполнении
 * сложных операций, таких как поиск файлов, обход дерева каталогов
 * и других манипуляций с файловой системой.
 *
 * Кросс-платформенность:
 * Класс Path абстрагирует от конкретных разделителей пути в
 * различных операционных системах. Это позволяет писать переносимый
 * код, который будет работать на разных платформах без изменений.
 *
 * Работа с внешними библиотеками:
 * Многие библиотеки и фреймворки в Java используют класс
 * Path для работы с файлами и директориями. Поэтому, для интеграции
 * с такими библиотеками, знание и использование класса Path
 * является необходимым.
 */