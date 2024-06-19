package Old._2024_06_16.mockTask;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс StudentRepository
 * Описание: Этот класс управляет данными студентов и курсов.
 * Поля:
 * Map<String, Student> students: хранит студентов по их id.
 * Map<String, Course> courses: хранит курсы по их id.
 * Map<String, Map<String, Integer>> studentCourseGrades: хранит оценки студентов по курсам.
 * Методы:
 * void addStudent(Student student): добавляет нового студента.
 * void addCourse(Course course): добавляет новый курс.
 * void enrollStudentToCourse(String studentId, String courseId): записывает студента на курс.
 * void updateGrade(String studentId, String courseId, int grade): обновляет оценку студента по курсу.
 * Map<String, Integer> getGradesByStudent(String studentId): возвращает оценки студента.
 * double getAverageGrade(String studentId): рассчитывает среднюю оценку студента.
 * List<Student> getStudentsWithGradesAbove(int grade): возвращает список студентов, у которых есть оценки выше указанного значения.
 * List<String> getTopPerformingStudents(int n): возвращает список n студентов с самыми высокими средними оценками.
 * void loadStudentsFromFile(String filePath) throws IOException: загружает студентов из файла.
 * void loadCoursesFromFile(String filePath) throws IOException: загружает курсы из файла.
 */

public class StudentRepository {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();
    private Map<String, Map<String, Integer>> studentCourseGrades = new HashMap<>();// ключ id студента, а значение id курса и оценка.

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        studentCourseGrades.putIfAbsent(student.getId(), new HashMap<>());
    }

    public void addCourse(Course course) {
        courses.put(course.getId(), course);
    }

    public void enrollStudentToCourse(String studentId, String courseId) {

    }

    public void updateGrade(String studentId, String courseId, int grade) {

    }

    public Map<String, Integer> getGradesByStudent(String studentId) {
        return null;
    }

    public double getAverageGrade(String studentId) {
        return 0.0;
    }

    public List<Student> getStudentsWithGradesAbove(int grade) {
        return null;
    }

    public List<String> getTopPerformingStudents(int n) {
        return null;
    }

    public void loadStudentsFromFile(String filePath) throws IOException {

    }

    public void loadCoursesFromFile(String filePath) throws IOException {

    }
}