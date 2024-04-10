package org.example._08_04_2024;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Department {
//    Энам Department с конструктором:
//    Описывает возможные отделы в компании.
//    Имеет поля, описывающие название отдела и его номер!!.
//    Конструктор с этими параметрами.
    IT("Informational technology",1000),
    HR("Electrical technology",10000);

    private String name;
    private int number;
}