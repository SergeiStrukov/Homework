package Old.org.example._08_04_2024;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//4
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Employee {
    private final static Faker faker = new Faker();
    private String name;
    private int age;
    private double salary;
    private Department department;

    public Employee() {
        this.name = faker.name().fullName();
        this.age = faker.number().numberBetween(18, 99);
        this.salary = faker.number().randomDouble(2, 2000, 4000);
        this.department = department;
    }
}
