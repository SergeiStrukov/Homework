package org.example._08_04_2024;

public class InfoOfWorkers implements EmployeeProcessor {
    //    Задание:
//        Реализовать описанные классы и интерфейс.
//        Реализовать класс(те создать свой новый), который реализует интерфейс EmployeeProcessor и обрабатывает сотрудников -
//        например, печатает информацию о каждом сотруднике,
//        рассчитывает среднюю зарплату, рассчитывает среднюю зарплату в каждом департаменте.
    @Override
    public void printInfoWorkers(Employee[] workers) {
//        печатает информацию о каждом сотруднике,
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }
    @Override
    public double countAverageSalary(Employee[] workers) {
        //рассчитывает среднюю зарплату
        double averageSalary;
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        averageSalary = sum / workers.length;
        return averageSalary;
    }

    @Override
    public void countAverageDepartmentSalary(Employee[] workers) {
        //рассчитывает среднюю зарплату в каждом департаменте.
        double sumSalaryIT = 0;
        double sumSalaryHR = 0;
        double averageSalaryIT;
        double averageSalaryHR;
        int countIT = 0;
        int countHR = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment().equals(Department.IT)) {
                sumSalaryIT += workers[i].getSalary();
                countIT++;
            } else if (workers[i].getDepartment().equals(Department.HR)) {
                sumSalaryHR += workers[i].getSalary();
                countHR++;
            }
        }
        averageSalaryIT = sumSalaryIT / countIT;
        averageSalaryHR = sumSalaryHR / countHR;
        System.out.println("Средняя зарплата в IT: " + averageSalaryIT);
        System.out.println("Средняя зарплата в департаменте HR: " + averageSalaryHR);
    }
}

interface EmployeeProcessor {
    void printInfoWorkers(Employee[] workers);

    double countAverageSalary(Employee[] workers);

    void countAverageDepartmentSalary(Employee[] workers);
}
