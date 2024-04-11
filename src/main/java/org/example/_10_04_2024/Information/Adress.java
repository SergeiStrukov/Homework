package org.example._10_04_2024.Information;

import lombok.Getter;
import lombok.Setter;
import org.example._10_04_2024.Enams.Country;
@Setter
@Getter
//6. Создать класс Address.
//        Поля:
//        - Страна(Энам)
//- Улица
//- номер дома
//- номер квартиры(если живет не в доме а в квартире, если в доме то номер квартиры == 0)
public class Adress {
    private Country country;
    private String street;
    private int numberHouse;
    private int numberFlat;

    public Adress(Country country, String street, int numberHouse, int numberFlat) {
        this.country = country;
        this.street = street;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
    }
}
