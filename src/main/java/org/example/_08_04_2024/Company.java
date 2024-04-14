package org.example._08_04_2024;

import com.github.javafaker.Faker;
//1
public class Company {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Manager manager = new Manager(
                faker.name().name(),
                faker.number().numberBetween(18, 99),
                faker.number().randomDouble(1, 2000, 4000),
                Department.HR,
                faker.number().randomDigit()
        );
        Manager secondManager = new Manager(
                faker.funnyName().name(),
                faker.number().numberBetween(18, 99),
                faker.number().randomDouble(1, 1000, 2000),
                Department.HR,
                faker.number().randomDigit()
        );
        Developer developer = new Developer(
                faker.name().username(),
                faker.number().numberBetween(21, 65),
                faker.number().randomDouble(1, 3000, 4000),
                Department.IT,
                faker.programmingLanguage().name()
        );
        Developer seniorDeveloper = new Developer(
                faker.name().username(),
                faker.number().numberBetween(21, 65),
                faker.number().randomDouble(1, 4000, 9000),
                Department.IT,
                faker.programmingLanguage().name()
        );
        Employee[] workers = {manager, secondManager, developer, seniorDeveloper};
        System.out.println("Информация о сотрудниках:");
        InfoOfWorkers EmployeeProcessor = new InfoOfWorkers();
        EmployeeProcessor.printInfoWorkers(workers);
        EmployeeProcessor.countAverageSalary(workers);
        EmployeeProcessor.countAverageDepartmentSalary(workers);
    }
}
//        Задание:
//        Реализовать описанные классы и интерфейс.
//        Создать несколько экземпляров классов Manager и Developer, а также поместить их в массив в классе Company.
//        Реализовать класс(те создать свой новый), который реализует интерфейс EmployeeProcessor и обрабатывает сотрудников -
//        например, печатает информацию о каждом сотруднике,
//        рассчитывает среднюю зарплату, рассчитывает среднюю зарплату в каждом департаменте.


