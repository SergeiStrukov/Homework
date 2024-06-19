package Old._2024_06_10;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
@AllArgsConstructor
public class StudentRegistry {
    @Getter
    private static Map<Integer, Student> students = new HashMap<>();
    private static final Faker FAKER = new Faker();
    private static int id = 0;

    public static void setStudents(Map<Integer, Student> students) {

        StudentRegistry.students = students;
    }

    public static void generateStudents() {
        for (int i = 0; i < 10; i++) {
            Student student = createStudent();
            students.put(student.getId(), student);
        }
    }

    public static Student createStudent() {

        return new Student(
                id++,
                FAKER.name().firstName(),
                FAKER.name().lastName(),
                FAKER.internet().emailAddress(),
                FAKER.number().randomDouble(2, 1, 5), // 2 знака после запятой для оценок
                getRandomMajor(),
                FAKER.number().numberBetween(1, 5),
                FAKER.bool().bool()
        );
    }

    private static Major getRandomMajor() {
        Major[] majors = Major.values();
        return majors[FAKER.random().nextInt(majors.length)];
    }

    public static void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            throw new IllegalArgumentException("same student");
        }
        students.put(student.getId(), student);
    }

    public static void removeStudent(int id) {
        if (!students.containsKey(id)){
            throw new NoSuchElementException("no such student");
        }
        students.remove(id);
    }

    public static List<Student> findStudentsByMajor(String major) {
        return students
                .values()
                .stream()
                .filter(student -> student.getMajor().name().equalsIgnoreCase(major))
                .collect(Collectors.toList());
    }

    public static double calculateAverageGrade() {
        return students.values().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public static List<Student> listStudentsByYear(int year) {
        return students.values().stream()
                .filter(student -> student.getYear() == year)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        generateStudents();
        // Дополнительный код для проверки, если нужно
        students.values().forEach(System.out::println);

    }
}
