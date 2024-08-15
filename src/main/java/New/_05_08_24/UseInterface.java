package New._05_08_24;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.LocalDateTime;
import java.time.Month;

public class UseInterface {

    //to Do
    // десереализация
    //юнит тесты
    // с/д 1 объекта
    public static void run() throws JsonProcessingException {
        LocalDateTime localDateTime4 = LocalDateTime.of(2024, Month.SEPTEMBER, 28, 14, 33);
        Controler controler = new Controler();
//        ServicesImp taskServices = new ServicesImp();

        TaskItem taskItem1 = new TaskItem("testTask1", "test 1", localDateTime4);
        TaskItem taskItem2 = new TaskItem("testTask2", "test 2", localDateTime4);
        TaskItem taskItem3 = new TaskItem("testTask3", "test 3", localDateTime4);
        TaskItem taskItem4 = new TaskItem("testTask4", "test 4", localDateTime4);

        controler.taskServices.createTask(taskItem1);
        controler.taskServices.createTask(taskItem2);
        controler.taskServices.createTask(taskItem3);
        controler.taskServices.createTask(taskItem4);

        System.out.println("getTask: " + controler.taskServices.getTask(taskItem1.getId()));
        System.out.println("getAllTasks:" + controler.taskServices.getAllTasksList());

        System.out.println("-------------------------");

        TaskItem taskItemUpdated = new TaskItem("Updated", "Updated111", localDateTime4);
        controler.taskServices.updateTask(taskItem1.getId(), taskItemUpdated);
        System.out.println("getAllTasks:" + controler.taskServices.getAllTasksList());
        System.out.println("-------------------------");

        controler.taskServices.deleteTask(taskItem4.getId());
        System.out.println("getAllTasks:" + controler.taskServices.getAllTasksList());


        System.out.println(controler.getAllTasks());

        controler.writeToJSON();


    }

}