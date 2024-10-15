//package New._05_08_24;
//
//import junit.framework.TestCase;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeEach;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class ServicesImpTest extends TestCase {
//
//    private ServicesImp taskServices;
//    private LocalDateTime localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
//
////    @BeforeEach
////    public void initial() {
////        taskServices = new ServicesImp();
//////        Controler controler = new Controler(taskServices);
////    }
//
//    @Test
//    public void testCreateTaskIsNotNull() {
//        taskServices = new ServicesImp();
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4); //ожидаемый и фактический
//
//        taskServices.createTask(taskItem1);
//        assertEquals(taskItem1, taskItem1);
//
//    }
//
//    @Test
//    public void testCreateTaskIsNull() {
//        taskServices = new ServicesImp();
//
//        TaskItem taskItem1 = null; //ожидаемый и фактический
//
//        taskServices.createTask(taskItem1);
//        assertEquals(taskItem1, taskItem1);
//    }
//
//    @Test
//    public void testCreateTaskNullPointer() {
//        taskServices = null;
//        TaskItem taskItem = null;
//
//        assertThrows(NullPointerException.class, () -> {
//            taskServices.createTask(taskItem);
//        });
//    }
//
//    @Test
//    public void testCreateTaskIsEmpty() {
//        taskServices = new ServicesImp();
//
//        TaskItem taskItem1 = new TaskItem("", "", null); //ожидаемый и фактический
//
//        taskServices.createTask(taskItem1);
//        assertEquals(taskItem1, taskItem1);
//    }
//
//
//    @Test
//    public void testGetTask() {
//    }
//
//    @Test
//    public void testUpdateTaskIsNull() {
//        taskServices = new ServicesImp();
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        taskServices.createTask(taskItem1);
//
//        TaskItem newtaskItem = null;
//
//        //        boolean expected = false; // ожидаемый
//        boolean fact = taskServices.updateTask(taskItem1.getId(), newtaskItem); // фактический
//        assertFalse(fact);
//    }
//
//    @Test
//    public void testUpdateTaskTitleIsEmpty() {
//        taskServices = new ServicesImp();
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
//        taskServices.createTask(taskItem1);
//
//        TaskItem newtaskItem = new TaskItem("", "test 1", localDateTime4);
//
//        //        boolean expected = false; // ожидаемый
//        boolean fact = taskServices.updateTask(taskItem1.getId(), newtaskItem); // фактический
//        assertFalse(fact);
//    }
//
//    @Test
//    public void testUpdateTaskSuccess() {
//        taskServices = new ServicesImp();
//
//        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4); // исходный
//
//        taskServices.createTask(taskItem1);
//
////        boolean expected = true; // ожидаемый
//        boolean fact = taskServices.updateTask(taskItem1.getId(), taskItem1); // фактический
//
//        assertTrue(fact);
//    }
//
//
//    @Test
//    public void testDeleteTask() {
//    }
//
//    @Test
//    public void testGetAllTasksList() {
//    }
//}