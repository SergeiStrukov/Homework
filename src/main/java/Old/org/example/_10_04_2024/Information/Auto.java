package Old.org.example._10_04_2024.Information;

import lombok.Getter;
import lombok.Setter;
import Old.org.example._10_04_2024.Enams.Colors;
import Old.org.example._10_04_2024.Enams.Model;
@Setter
@Getter
//7. Создать класс Car.
//        Поля://
//        - Марка машины(Энам)
//- кол-во дверей
//- спортивная или нет
//- мощность в лс
//- стоимость
//- год выпуска
//- цвет(энам)
public class Auto {
    private Model model;
    private int doorCount;
    private boolean isSport;
    private int horsePower;
    private int price;
    private int yearOfProduction;
    private Colors colors;

    public Auto(Model model, int doorCount, boolean isSport, int horsePower, int price, int yearOfProduction, Colors colors) {
        this.model = model;
        this.doorCount = doorCount;
        this.isSport = isSport;
        this.horsePower = horsePower;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.colors = colors;
    }
}
