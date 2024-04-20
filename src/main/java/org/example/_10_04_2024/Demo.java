package org.example._10_04_2024;

import org.example._10_04_2024.Enams.Colors;
import org.example._10_04_2024.Enams.Country;
import org.example._10_04_2024.Enams.Currancy;
import org.example._10_04_2024.Enams.Model;
import org.example._10_04_2024.Information.Account;
import org.example._10_04_2024.Information.Address;
import org.example._10_04_2024.Information.Auto;
import org.example._10_04_2024.Information.Person;
//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example._10_04_2024.Enams.Colors.Black;

public class Demo {

    public static void main(String[] args) {

        Auto auto1 = new Auto(Model.AUDI, 2, false, 250, 1000, 2024, Colors.Green);
        Auto auto2 = new Auto(Model.AUDI, 5, false, 400, 30000, 2015, Colors.Black);
        Auto auto3 = new Auto(Model.Mers, 6, true, 510, 20000, 2024, Colors.Black);
        Auto auto4 = null;
        List<Auto> autos = Arrays.asList(auto1, auto2, auto3, auto4);

        Account account1 = new Account(Currancy.EURO, 200, 10);
        Account account2 = new Account(Currancy.RUB, 2000, 100);
        Account account3 = new Account(Currancy.USD, 1600, 1);
        Account account4 = new Account(Currancy.EURO, 1, 1000);
        Account account5 = new Account(Currancy.RUB, 18000, 101);
        List<Account> accounts = Arrays.asList(account2, account3);
        List<Account> accounts2 = Arrays.asList(account1, account2);
        List<Account> accounts3 = Arrays.asList(account3);
        List<Account> accounts4 = Arrays.asList(account4, account5);

        Address address1 = new Address(Country.Germany, "Kosmonavtov", 25, 22);
        Address address2 = new Address(Country.Russia, "Kushelevskay", 23, 23);
        Address address3 = new Address(Country.Germany, "Lermontova", 25, 0);
        List<Address> addresses = Arrays.asList(address1, address2, address3);

        Person person = new Person("Nik", "Pchol", address1, 1300.4, auto1, accounts3);
        Person person2 = new Person("Arseniy", "Petrov", address2, 3300.1, auto2, accounts);
        Person person3 = new Person("Petya", "Vasiliev", address3, 3100.2, auto3, accounts2);
        Person person4 = new Person("Dmitriy", "Cherniyh", address2, 4100.2, auto4, accounts4);
        List<Person> persons = Arrays.asList(person, person2, person3, person4);

        System.out.println((findNotReadAndNotSport(persons)));
        System.out.println("Средняя зарплата по стране составляет: " + checkAverageSalaryCountry(persons, Country.Germany));
        System.out.println(checkHeightBalance(persons, 1500));
        System.out.println((findYearOfReleased(persons, 2016)));
        System.out.println((findSameStreetButDifferentHouses("Lermontova", 21, persons)));
        System.out.println((findPeopleWithoutAuto(persons)));
        System.out.println(findSportCar(persons));
        System.out.println(findPeopleWithSomeAccounts(persons));
        System.out.println(findFastestCars(persons));
        System.out.println(findHousesNumberFive(persons));
        System.out.println(findNSameModelSameColors(persons));
        System.out.println(findPeopleWithHeightSalary(persons));
        System.out.println(findPeopleWithTopBalance(persons));
        System.out.println(findPeopleWithNewCars(persons));
        System.out.println(findNeedColorNotSport(persons, Colors.Black));
        System.out.println(findResidentsInNonZeroApartment(persons));
        System.out.println(findPeopleWithExpensiveCar(persons, 10000));
        System.out.println(findPeopleWithEvenNumberOfDoors(persons));
        System.out.println(findLowAccount(persons));
        System.out.println(findPeopleWithCarAboveSalary(persons));
        System.out.println(findPeopleWithNumberOfDoorsAboveFour(persons));
        System.out.println(findPeopleWithSameModel(persons));
        System.out.println(findResidentsInNApartmentWithoutAuto(persons));
    }

    //        Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
    public static List<String> findNotReadAndNotSport(List<Person> persons) {
        List<String> result = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && !persons.get(i).getAuto().isSport() && !persons.get(i).getAuto().getColors().equals(Colors.Red)) {
                result.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return result;
    }

    //    Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
    public static double checkAverageSalaryCountry(List<Person> persons, Country country) {
        double counter = 0;
        double result = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAddress().getCountry() == Country.Germany) {
                result += persons.get(i).getSalary();
                counter++;
            }
        }
        return result / counter;
    }

    /*Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.*/
    public static List<String> checkHeightBalance(List<Person> persons, double balance) {
        List<String> people = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.get(i).getAccounts().size(); j++) {
                if (persons.get(i).getAccounts().get(j).getCurrancy().equals(Currancy.EURO) && (persons.get(i).getAccounts().get(j).getBalance() > balance)) {
                    people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
                }
            }
        }
        return people;
    }


//     Перечислить всех, у кого автомобиль был выпущен до определенного года.

    public static List<String> findYearOfReleased(List<Person> persons, int year) {
        List<String> people = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && persons.get(i).getAuto().getYearOfProduction() < year) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

//     Найти лиц, живущих на одной улице, но в разных домах. // Упростил задачу. (Известна улица и номер дома).

    public static List<String> findSameStreetButDifferentHouses(String street, int numberOfHouse, List<Person> persons) {
        List<String> people = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAddress().getStreet().equals(street) && persons.get(i).getAddress().getNumberHouse() != numberOfHouse) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

    // Вывести список всех лиц без автомобилей (предполагая, что авто может быть null).
    public static List<String> findPeopleWithoutAuto(List<Person> persons) {
        List<String> people = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() == null) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

    //    Определить количество лиц, имеющих спортивный автомобиль с мощностью более 300 л.с.
    public static int findSportCar(List<Person> persons) {
        int summ = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && persons.get(i).getAuto().getHorsePower() > 300) {
                summ++;
            }
        }
        return summ;
    }

    ////    Найти и вывести имена и фамилии лиц, имеющих более одного счета (предполагая наличие списка счетов).
    public static List<String> findPeopleWithSomeAccounts(List<Person> persons) {
        List<String> people = new ArrayList<>(persons.size());
        int summOfAccounts = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAccounts().size() > 1) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

    //    Вывести список лиц, чьи автомобили являются наиболее мощными в своем классе (спортивные/неспортивные)
    public static List<String> findFastestCars(List<Person> persons) {
        List<String> people = new ArrayList<>(persons.size());
        List<String> fastCars = new ArrayList<>();
        int topSportSpeed = 0;
        int topSpeed = 0;
        String topSportCar = " ";
        String topCar = " ";
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && persons.get(i).getAuto().isSport() && persons.get(i).getAuto().getHorsePower() > topSportSpeed) {
                topSportSpeed = persons.get(i).getAuto().getHorsePower();
                topSportCar = persons.get(i).getName() + " " + persons.get(i).getSurname();
            } else if (persons.get(i).getAuto() != null && !persons.get(i).getAuto().isSport() && persons.get(i).getAuto().getHorsePower() > topSpeed) {
                topSpeed = persons.get(i).getAuto().getHorsePower();
                topCar = persons.get(i).getName() + " " + persons.get(i).getSurname();
            }
        }
        fastCars.add(0, topSportCar);
        fastCars.add(1, topCar);
        return fastCars;
    }

    //    Вывести всех лиц, живущих в домах, номера которых заканчиваются на "5".
    public static List<String> findHousesNumberFive(List<Person> persons) {
        int numberOfHouse = 5;
        List<String> people = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAddress().getNumberHouse() % 10 == numberOfHouse) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

    //    Найти лиц с автомобилями определенной марки и цвета.
    public static List<String> findNSameModelSameColors(List<Person> persons) {
        List<String> result = new ArrayList<>(persons.size());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && persons.get(i).getAuto().getModel().equals(Model.BMW) &&
                    persons.get(i).getAuto().getColors().equals(Black)) {
                result.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return result;
    }

    //    Вывести имена лиц, у которых зарплата выше среднего по массиву.
    public static List<String> findPeopleWithHeightSalary(List<Person> persons) {
        List<String> people = new ArrayList<>();
        double sumSalary = 0;
        for (Person person : persons) {
            sumSalary += person.getSalary();
        }
        double averageSalary = sumSalary / persons.size();
        for (Person person : persons) {
            if (person.getSalary() > averageSalary) {
                people.add(person.getName());
            }
        }
        return people;
    }

    //        Определить лиц с наибольшим балансом на счету.
    public static List<String> findPeopleWithTopBalance(List<Person> persons) {
        List<String> people = new ArrayList<>();
        double topEuroBalance = 0;
        double topRubBalance = 0;
        double topDollarBalance = 0;
        String topEuroPerson = null;
        String topRubPerson = null;
        String topDollarPerson = null;
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.get(i).getAccounts().size(); j++) {
                if (persons.get(i).getAccounts().get(j) != null) {
                    double balance = persons.get(i).getAccounts().get(j).getBalance();
                    if (persons.get(i).getAccounts().get(j).getCurrancy().equals(Currancy.EURO)
                            && persons.get(i).getAccounts().get(j).getBalance() > topEuroBalance) {
                        topEuroBalance = balance;
                        topEuroPerson = persons.get(i).getName() + persons.get(i).getSurname() + " c наибольшим балансом в евро.";
                    }
                    if (persons.get(i).getAccounts().get(j).getCurrancy().equals(Currancy.USD)
                            && persons.get(i).getAccounts().get(j).getBalance() > topDollarBalance) {
                        topDollarBalance = balance;
                        topDollarPerson = persons.get(i).getName() + persons.get(i).getSurname() + " c наибольшим балансом в долларах.";
                    }
                    if (persons.get(i).getAccounts().get(j).getCurrancy().equals(Currancy.RUB)
                            && persons.get(i).getAccounts().get(j).getBalance() > topRubBalance) {
                        topRubBalance = balance;
                        topRubPerson = persons.get(i).getName() + persons.get(i).getSurname() + " c наибольшим балансом в рублях.";
                    }
                }
            }
        }
        if (topRubPerson != null) {
            people.add(topRubPerson);
        }
        if (topDollarPerson != null) {
            people.add(topDollarPerson);
        }
        if (topEuroPerson != null) {
            people.add(topEuroPerson);
        }
        return people;
    }

    //    Вывести список лиц, чьи автомобили были куплены новыми (год выпуска авто равен текущему году).
    public static List<String> findPeopleWithNewCars(List<Person> persons) {
        int currentYear = 2024;
        List<String> people = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && persons.get(i).getAuto().getYearOfProduction() == currentYear) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }

    //    Найти лиц, у которых есть автомобиль определенного цвета, но не спортивный.
    public static List<String> findNeedColorNotSport(List<Person> persons, Colors color) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && !persons.get(i).getAuto().isSport() &&
                    persons.get(i).getAuto().getColors().equals(color)) {
                result.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return result;
    }

    //    Вывести список лиц, проживающих в квартирах (номер квартиры не равен 0).
    public static List<String> findResidentsInNonZeroApartment(List<Person> persons) {
        List<String> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAddress().getNumberFlat() > 0) {
                people.add(person.getName() + " " + person.getSurname());
            }
        }
        return people;
    }

    //        Найти и вывести лиц, чьи автомобили имеют стоимость выше заданной.
    public static List<String> findPeopleWithExpensiveCar(List<Person> persons, int price) {
        List<String> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAuto() != null && person.getAuto().getPrice() > price) {
                people.add(person.getName() + " " + person.getSurname());
            }
        }
        return people;
    }

    //    Вывести имена и фамилии всех лиц, чьи автомобили имеют четное количество дверей.
    public static List<String> findPeopleWithEvenNumberOfDoors(List<Person> persons) {
        List<String> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAuto() != null && person.getAuto().getDoorCount() % 2 == 0) {
                people.add(person.getName() + " " + person.getSurname());
            }
        }
        return people;
    }

    //    Определить и вывести лицо, имеющего счет с наименьшим балансом.
    public static List<String> findLowAccount(List<Person> persons) {
        List<String> people = new ArrayList<>();
        double startBalance = Double.MAX_VALUE;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAccounts() != null) {
                for (int j = 0; j < persons.get(i).getAccounts().size(); j++) {
                    double balance = persons.get(i).getAccounts().get(j).getBalance();
                    if (balance < startBalance) {
                        startBalance = balance;
                    }
                }
            }
        }
        for (Person person : persons) {
            if (person.getAccounts() != null) {
                for (Account account : person.getAccounts()) {
                    if (account.getBalance() == startBalance) {
                        people.add(person.getName() + " " + person.getSurname());
                    }
                }
            }
        }
        return people;
    }

    //    Вывести список лиц, имеющих автомобили, которые стоят дороже их зарплаты.
    public static List<String> findPeopleWithCarAboveSalary(List<Person> persons) {
        List<String> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAuto() != null && person.getAuto().getPrice() > person.getSalary()) {
                people.add(person.getName() + " " + person.getSurname());
            }
        }
        return people;
    }

    //    Определить количество лиц, у которых есть автомобили с количеством дверей больше 4.
    public static List<String> findPeopleWithNumberOfDoorsAboveFour(List<Person> persons) {
        List<String> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAuto() != null && person.getAuto().getDoorCount() > 4) {
                people.add(person.getName() + " " + person.getSurname());
            }
        }
        return people;
    }

    //    Вывести список лиц, имеющих автомобиль той же марки, что и автомобиль первого лица в массиве.
    public static List<String> findPeopleWithSameModel(List<Person> persons) {
        List<String> people = new ArrayList<>();
        if (persons.get(0).getAuto() == null) {
            return people;
        }
        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getAuto() != null && persons.get(i).getAuto().getModel().equals(persons.get(0).getAuto().getModel())) {
                people.add(persons.get(i).getName() + " " + persons.get(i).getSurname());
            }
        }
        return people;
    }
//    (Найти лиц, чей счет в определенной валюте является единственным с такой валютой в массиве.?)

    //    Вывести список лиц, у которых нет автомобилей и живут в квартирах.
    public static List<String> findResidentsInNApartmentWithoutAuto(List<Person> persons) {
        List<String> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAddress().getNumberFlat() > 0 && person.getAuto() == null) {
                people.add(person.getName() + " " + person.getSurname());
            }
        }
        return people;
    }
}
