package New._05_08_24;

import java.util.List;
import java.util.UUID;

public interface TaskServices {

    TaskItem createTask(TaskItem newTaskItem);

    TaskItem getTask(UUID id);

    boolean updateTask(UUID id, TaskItem newTaskItem);

    boolean deleteTask(UUID id);

    List<TaskItem> getAllTasksList();

}
