package Old.org.Homework07_05_24.Task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //    Задание 1: Введение в наследование
//    Тема: Создание базового и производного классов.
//            Описание: Создайте базовый класс Person с полями имя,
//    фамилия и возраст. От него должен наследоваться класс Student,
//    который добавляет поле studentID. Реализуйте геттеры и сеттеры для всех полей.
//    В main создайте экземпляры Person и Student, установите значения их полей и выведите информацию о каждом объекте.
//
//    Результат в main:
//
//    Создание объекта Person.
//    Создание объекта Student.
//    Вывод информации об объектах с помощью System.out.println().
}
