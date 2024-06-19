package Old._2024_06_10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Double grade;
    private Major major;
    private int year;
    private boolean fulltime;

    public Student(int id, String firstName, String lastName, String email,
                   Double grade,
                   Major major, int year, boolean fulltime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.grade = grade;
        this.major = major;
        this.year = year;
        this.fulltime = fulltime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                ", major=" + major +
                ", year=" + year +
                ", fulltime=" + fulltime +
                '}';
    }

}

enum Major {
    COMPUTER_SCIENCE,
    MATHEMATICS,
    PHYSICS,
    CHEMISTRY,
    BIOLOGY,
    ENGINEERING
}

