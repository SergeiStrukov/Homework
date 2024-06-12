package _2024_06_10;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static _2024_06_10.StudentRegistry.generateStudents;
import static org.junit.jupiter.api.Assertions.*;

class StudentRegistryTest {

    @Test
    void addStudent() {
        Student student = StudentRegistry.createStudent();
        StudentRegistry.addStudent(student);
        assertTrue(StudentRegistry.getStudents().containsKey(student.getId()));
    }

    @Test
    void addStudentException() {
        Student student = StudentRegistry.createStudent();
        StudentRegistry.addStudent(student);
        assertThrows(IllegalArgumentException.class, () -> StudentRegistry.addStudent(student));
    }

    @Test
    void removeStudent() {
        Student student = StudentRegistry.createStudent();
        StudentRegistry.addStudent(student);
        StudentRegistry.removeStudent(student.getId());
        assertFalse(StudentRegistry.getStudents().containsKey(student.getId()));
    }

    @Test
    void findStudentsByMajor() {
        StudentRegistry.generateStudents();
        Map<Integer, Student> students = StudentRegistry.getStudents();
        List<Student> bStudents = StudentRegistry.findStudentsByMajor("BIOLOGY");
        assertTrue(bStudents.stream().allMatch(student -> student.getMajor().name().equalsIgnoreCase("BIOLOGY")));
        System.out.println("Students from biology: " + bStudents.size());
    }

    @Test
    void calculateAverageGrade() {
        StudentRegistry.generateStudents();
        Map<Integer, Student> students = StudentRegistry.getStudents();
        double grade1 = 4.5;
        double calcAverageGrade = students.values().stream()
                .mapToDouble(Student::getGrade)
                .peek(grade -> System.out.println("Grade: " + grade))
                .average()
                .orElse(0.0);
        assertNotEquals(grade1, calcAverageGrade, "Средняя оценка не должна быть равна 4.5");
        System.out.println("Calc average grade:" + calcAverageGrade);
    }

    @Test
    void listStudentsByYear() {
    }
}