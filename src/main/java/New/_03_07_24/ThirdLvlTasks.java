package New._03_07_24;

import java.util.List;
import java.util.stream.Collectors;

public class ThirdLvlTasks {
    //    ### Более сложные задачи
    public static void main(String[] args) {
        List<Double> list = List.of(123.0, 124.5);
        System.out.println(createAnotherType(list));
    }
//            22. **Поиск уникальных символов**: Найти все уникальные символы из списка строк.
//23. **Разделение списка**: Разделить список чисел на два списка: четные и нечетные числа.
//            24. **Проверка наличия дубликатов**: Проверить, есть ли в списке дубликаты.
//25. **Среднее значение**: Найти среднее значение чисел в списке.
//            26. **Обратная сортировка**: Отсортировать список строк в обратном порядке.
//            27. **Соединение списков**: Объединить два списка в один.
//28. **Удаление null-значений**: Удалить все null-значения из списка.
//29. **Сглаживание списков списков**: Преобразовать список списков в один список.
//            30. **Преобразование строки в массив символов**: Преобразовать строку в массив символов и отсортировать его.

    //21. **Преобразование объекта в другой объект**: Преобразовать список одного типа объектов в список другого типа объектов.
    public static List<Integer> createAnotherType(List<Double> list) {
        return list.stream()
//                .mapToInt(value -> value.intValue())
//                .boxed()
//                .collect(Collectors.toList());
                .map(Double::intValue)
                .collect(Collectors.toList());
    }
//  22. **Поиск уникальных символов**: Найти все уникальные символы из списка строк.
//    public static List<Character> findUniqueWords(List<String>list){
//        return list.stream()
//                .
//    }

}
