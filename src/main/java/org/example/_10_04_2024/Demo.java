package org.example._10_04_2024;

import com.github.javafaker.Color;
import com.github.javafaker.Faker;
import org.example._10_04_2024.Enams.Colors;
import org.example._10_04_2024.Enams.Country;
import org.example._10_04_2024.Enams.Currancy;
import org.example._10_04_2024.Information.Account;
import org.example._10_04_2024.Information.Adress;

import java.util.Random;

public class Demo {
    Faker faker = new Faker();
    Random random = new Random();

    public static void main(String[] args) {
        Colors color = Colors.Black;
        Colors color1 = Colors.Green;
        Colors color2 = Colors.White;
        Currancy currancy = Currancy.EURO;
        Currancy currancy1 = Currancy.RUB;
        Currancy currancy2 = Currancy.USD;
        Country country = Country.Germany;
        Country country2 = Country.Russia;
        Country country3 = Country.USA;
        Adress adress = new Adress(Country.USA,"Kushelevskay",21,23);
        Adress adress2 = new Adress(Country.Russia,"Kushelevskay",21,23);
        Adress adress3 = new Adress(Country.USA,"Kushelevskay",21,23);
        Account account = new Account(currancy,1000,10);
    }

    public void  findNotReadAndNotSport(){

    }
}
