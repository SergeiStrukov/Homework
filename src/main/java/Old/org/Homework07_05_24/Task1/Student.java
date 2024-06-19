package Old.org.Homework07_05_24.Task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@ToString
@Getter
@Setter
public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int age;
    private List<Course> courses;

    @Override
    public int compareTo(Student otherStudents) {
        if (this.age == otherStudents.getAge()) {
            return this.getFirstName().compareTo(otherStudents.getFirstName());
        }
        return this.age - otherStudents.getAge();
    }


    public Student(String firstName1, String lastName1, int age1, List<Course> courses) {
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.age = age1;
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Ошибка: переданный возраст не может быть отрицательным");
        }
        this.age = age;
    }

    // Методы для работы со списком курсов
    public void addCourse(Course course) {
        Objects.requireNonNull(course, "Курс не может быть null");
        courses.add(course);
    }

    public void removeCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Ошибка: переданный курс равен null");
        }
        courses.remove(course);
    }

    public static List<Course> countCourses(Student student) {
        return student.getCourses();
    }
}

class StudentLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getLastName().compareTo(o1.getLastName());
    }
}

class StudentFirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}

class StudentAgeNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getAge() == o1.getAge()) {
            return o2.getFirstName().compareTo(o1.getFirstName());
        }
        return o1.getAge() - o2.getAge();
    }
}

//    Задание 4: Сортировка по нескольким полям с помощью Comparator
//    Тема: Многоуровневая сортировка.
//    Описание: Используя Comparator, реализуйте сортировку студентов сначала по фамилии,
//    затем по имени, а затем по возрасту.
//    В методе main отсортируйте список студентов и выведите его.
class StudentLastNameFirstNameAgeComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (!o1.getLastName().equals(o2.getLastName())) {
            return o2.getLastName().compareTo(o1.getLastName());
        }
        if (!o1.getFirstName().equals(o2.getFirstName())) {
            return o2.getFirstName().compareTo(o1.getFirstName());
        }
        return o1.getAge() - o2.getAge();
    }
}
