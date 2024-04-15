package org.example._10_04_2024;

import org.example._10_04_2024.Enams.Colors;
import org.example._10_04_2024.Enams.Country;
import org.example._10_04_2024.Enams.Currancy;
import org.example._10_04_2024.Enams.Model;
import org.example._10_04_2024.Information.Account;
import org.example._10_04_2024.Information.Address;
import org.example._10_04_2024.Information.Auto;
import org.example._10_04_2024.Information.Person;

import java.util.Arrays;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        Auto auto1 = new Auto(Model.Mers, 2, false, 250, 700, 2022, Colors.Green);
        Auto auto2 = new Auto(Model.AUDI, 2, true, 400, 70000, 2015, Colors.Black);
        Auto auto3 = new Auto(Model.BMW, 4, false, 300, 20000, 1999, Colors.Black);
        Auto auto4 = null;
        Auto[] autos = new Auto[]{auto1, auto2, auto3, auto4};

        Account account1 = new Account(Currancy.EURO, 3000, 10);
        Account account2 = new Account(Currancy.RUB, 2000, 10);
        Account account3 = new Account(Currancy.USD, 1000, 10);
        Account[] accounts = new Account[]{account1, account2, account3};
        Account[] accounts2 = new Account[]{account1, account3};
        Account[] accounts3 = new Account[]{account1};

        Address address1 = new Address(Country.Germany, "Lermontova", 21, 22);
        Address address2 = new Address(Country.Russia, "Lermontova", 23, 23);
        Address address3 = new Address(Country.Germany, "Lermontova", 22, 23);
        Address[] addresses = new Address[]{address1, address2, address3};

        Person person = new Person("Nik", "Pcholkin", address1, 1300.4, auto1, accounts);
        Person person2 = new Person("Arseny", "Petrov", address2, 2300.1, auto2, accounts);
        Person person3 = new Person("Petya", "Petrov", address3, 4100.2, auto4, accounts);
        Person person4 = new Person("Petya", "Petrov", address3, 4100.2, auto4, accounts);
        Person[] persons = new Person[]{person, person2, person3};

        System.out.println(Arrays.toString(findNotReadAndNotSport(persons)));
        System.out.println("Средняя зарплата по стране составляет: " + CheckAverageSalaryCountry(persons, Country.Germany));
        System.out.println(Arrays.toString(CheckHeighterBalance(persons, 1600)));
        System.out.println(Arrays.toString(findYearOfReleased(persons, 2016)));
        System.out.println(Arrays.toString(findSameStreetButDifferentHouses("Lermontova", 21, persons)));
        System.out.println(Arrays.toString(findPeopleWithouAuto(persons)));
        System.out.println(findSportCar(persons));
    }

    //    Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
    public static String[] findNotReadAndNotSport(Person[] persons) {
        String[] result = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAuto()!=null && !persons[i].getAuto().isSport() && !persons[i].getAuto().getColors().equals(Colors.Black)) {
                result[i] = persons[i].getName() + " " + persons[i].getSurname();
            }
        }
        return result;
    }

    //    Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
    public static double CheckAverageSalaryCountry(Person[] persons, Country country) {
        double counter = 0;
        double result = 0;
        double averageSalary = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAddress().getCountry() == Country.Germany) {
                result += persons[i].getSalary();
                counter++;
            }
        }
        averageSalary = result / counter;
        return averageSalary;
    }

    /*Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.*/
    public static String[] CheckHeighterBalance(Person[] persons, double balance) {
        String[] people = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAccounts()[i].getCurrancy().equals(Currancy.EURO) && (persons[i].getAccounts()[i].getBalance() > balance)) {
                people[i] = persons[i].getName() + " " + persons[i].getSurname();
            }
        }
        return people;
    }

    //
//
//    /**
//     * Перечислить всех, у кого автомобиль был выпущен до определенного года.
//     */
    public static String[] findYearOfReleased(Person[] person, int year) {
        String[] people = new String[person.length];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAuto() != null && person[i].getAuto().getYearOfProduction() < year) {
                people[i] = person[i].getName() + " " + person[i].getSurname();
            }
        }
        return people;
    }

    /**
     * Найти лиц, живущих на одной улице, но в разных домах. // Упростил задачу.
     */
    public static String[] findSameStreetButDifferentHouses(String street, int numberOfHouse, Person[] person) {
        String[] people = new String[person.length];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAddress().getStreet().equals(street) && person[i].getAddress().getNumberHouse() != numberOfHouse) {
                people[i] = person[i].getName() + " " + person[i].getSurname();
            }
        }
        return people;
    }

    // Вывести список всех лиц без автомобилей (предполагая, что авто может быть null).
    public static String[] findPeopleWithouAuto(Person[] person) {
        String[] people = new String[person.length];
            for (int i = 0; i < person.length; i++) {
                if (person[i].getAuto() != null) {
                    people[i] = person[i].getName() + " " + person[i].getSurname();
                } else
                {
                    people[i] = null;
                }
            }
        return people;
    }
//    Определить количество лиц, имеющих спортивный автомобиль с мощностью более 300 л.с.
    public static int findSportCar(Person[] person) {
        int summ = 0;
        String [] people = new String[person.length];
        for (int i = 0; i < people.length; i++) {
            if (person[i].getAuto() != null && person[i].getAuto().getHorsePower() > 300){
                summ++;
            }
        }
        return summ;
    }
//    Найти и вывести имена и фамилии лиц, имеющих более одного счета (предполагая наличие списка счетов).
    public static String[] findPeopleWithSomeAccounts(){

    }
}

