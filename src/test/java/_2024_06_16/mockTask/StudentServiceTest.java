package _2024_06_16.mockTask;

import Old._2024_06_16.mockTask.Student;
import Old._2024_06_16.mockTask.StudentRepository;
import Old._2024_06_16.mockTask.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @BeforeEach
    void setUp(){
        studentService = new StudentService(studentRepository);
    }
    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentService studentService;
    @Mock
    Student student;

    @Test
    void registerStudentVerifyTest() {
        studentService.registerStudent(student);
        verify(studentRepository).addStudent(student);
    }
}