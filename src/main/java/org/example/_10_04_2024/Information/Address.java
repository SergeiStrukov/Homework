package org.example._10_04_2024.Information;

import lombok.Getter;
import lombok.Setter;
import org.example._10_04_2024.Enams.Country;

//6. Создать класс Address.
//        Поля:
//        - Страна(Энам)
//- Улица//
//- номер дома
//- номер квартиры(если живет не в доме, а в квартире, если в доме то номер квартиры == 0)
@Setter
@Getter
public class Address {
    private Country country;
    private String street;
    private int numberHouse;
    private int numberFlat;

    public Address(Country country, String street, int numberHouse, int numberFlat) {
        this.country = country;
        this.street = street;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
    }
}
