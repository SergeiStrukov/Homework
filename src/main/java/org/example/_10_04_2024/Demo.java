package org.example._10_04_2024;

import org.example._10_04_2024.Enams.Colors;
import org.example._10_04_2024.Enams.Country;
import org.example._10_04_2024.Enams.Currancy;
import org.example._10_04_2024.Enams.Model;
import org.example._10_04_2024.Information.Account;
import org.example._10_04_2024.Information.Address;
import org.example._10_04_2024.Information.Auto;
import org.example._10_04_2024.Information.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Auto auto1 = new Auto(Model.Mers, 2, false, 250, 700, 2022, Colors.Green);
        Auto auto2 = new Auto(Model.AUDI, 2, true, 400, 70000, 2015, Colors.Black);
        Auto auto3 = new Auto(Model.BMW, 4, true, 310, 20000, 1999, Colors.Black);
        Auto auto4 = null;
        List <Auto> autos = Arrays.asList(auto1, auto2, auto3, auto4);

        Account account1 = new Account(Currancy.EURO, 3000, 10);
        Account account2 = new Account(Currancy.RUB, 2000, 10);
        Account account3 = new Account(Currancy.EURO, 1600, 10);
        Account account4 = new Account(Currancy.USD, 1600, 10);
        List <Account> accounts = Arrays.asList(account1, account2, account3, account4);
        List <Account> accounts2 = Arrays.asList(account1, account2);
        List <Account> accounts3 = Arrays.asList(account1);

        Address address1 = new Address(Country.Germany, "Lermontova", 21, 22);
        Address address2 = new Address(Country.Russia, "Lermontova", 23, 23);
        Address address3 = new Address(Country.Germany, "Lermontova", 22, 23);
        List <Address> addresses = Arrays.asList(address1, address2, address3);

        Person person = new Person("Nik", "Pchol", address1, 1300.4, auto1, accounts);
        Person person2 = new Person("Arseny", "Petrov", address2, 2300.1, auto2, accounts2);
        Person person3 = new Person("Petya", "Petrov", address3, 4100.2, auto3, accounts);
        Person person4 = new Person("Petya", "Cherniy", address3, 4100.2, auto4, accounts);
        List <Person> persons = Arrays.asList(person, person2, person3,person4);

        System.out.println((findNotReadAndNotSport(persons)));
        System.out.println("Средняя зарплата по стране составляет: " + CheckAverageSalaryCountry(persons, Country.Germany));
        System.out.println(CheckHeighterBalance(persons, 1500));
        System.out.println((findYearOfReleased(persons, 2016)));
        System.out.println((findSameStreetButDifferentHouses("Lermontova", 21, persons)));
        System.out.println((findPeopleWithouAuto(persons)));
        System.out.println(findSportCar(persons));
    }

    //    Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
    public static List<String> findNotReadAndNotSport(List<Person> persons) {
        List <String> result = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto()!=null && !persons.get(i).getAuto().isSport() && !persons.get(i).getAuto().getColors().equals(Colors.Red)) {
                result.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return result;
    }

    //    Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
    public static double CheckAverageSalaryCountry(List<Person> persons, Country country) {
        double counter = 0;
        double result = 0;
        double averageSalary = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAddress().getCountry() == Country.Germany) {
                result += persons.get(i).getSalary();
                counter++;
            }
        }
        averageSalary = result / counter;
        return averageSalary;
    }
    /*Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.*/
    public static List<String> CheckHeighterBalance(List<Person> persons, double balance) {
        List <String> people = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAccounts().get(i).getCurrancy().equals(Currancy.EURO) && (persons.get(i).getAccounts().get(i).getBalance() > balance)) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

    /**
     * Перечислить всех, у кого автомобиль был выпущен до определенного года.
     */
    public static List<String> findYearOfReleased(List<Person> person, int year) {
        List <String> people= new ArrayList<>(person.size());
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getAuto() != null && person.get(i).getAuto().getYearOfProduction() < year) {
                people.add(person.get(i).getName() + " " + person.get(i).getSurname());
            }
        }
        return people;
    }
//
//    /**
//     * Найти лиц, живущих на одной улице, но в разных домах. // Упростил задачу.
//     */
    public static List <String> findSameStreetButDifferentHouses(String street, int numberOfHouse, List <Person> person) {
        List <String> people = new ArrayList<>(person.size());
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getAddress().getStreet().equals(street) && person.get(i).getAddress().getNumberHouse() != numberOfHouse) {
                people.add(person.get(i).getName() + " " + person.get(i).getSurname()) ;
            }
        }
        return people;
    }

    // Вывести список всех лиц без автомобилей (предполагая, что авто может быть null).
    public static List<String> findPeopleWithouAuto(List<Person> person) {
        List <String> people = new ArrayList<>(person.size());
            for (int i = 0; i < person.size(); i++) {
                if (person.get(i).getAuto() == null) {
                    people.add(person.get(i).getName() + " " + person.get(i).getSurname());
                }
            }
        return people;
    }
//    Определить количество лиц, имеющих спортивный автомобиль с мощностью более 300 л.с.
    public static int findSportCar(List<Person> person) {
        int summ = 0;
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getAuto() != null && person.get(i).getAuto().getHorsePower() > 300){
                summ++;
            }
        }
        return summ;
    }
////    Найти и вывести имена и фамилии лиц, имеющих более одного счета (предполагая наличие списка счетов).
////    public static String[] findPeopleWithSomeAccounts(){
////
////    }
}

