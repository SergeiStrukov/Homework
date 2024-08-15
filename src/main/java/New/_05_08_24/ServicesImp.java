package New._05_08_24;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ServicesImp implements TaskServices {
    private List<TaskItem> tasksList = new ArrayList<>();


    @Override
    public TaskItem createTask(TaskItem newTaskItem) {
        tasksList.add(newTaskItem);
//        System.out.println(tasksList.size());
        return newTaskItem;
    }

    @Override
    public TaskItem getTask(UUID id) {
        return tasksList.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public boolean updateTask(UUID id, TaskItem newTaskItem) {
        TaskItem t = getTask(id);

        if (newTaskItem == null) {
            return false;
        }

        if (newTaskItem.getTitle() != null && !newTaskItem.getTitle().isEmpty()) {
            t.setTitle(newTaskItem.getTitle());
        }

        if (newTaskItem.getDescription() != null && !newTaskItem.getDescription().isEmpty()) {
            t.setDescription(newTaskItem.getDescription());
        }

        if (newTaskItem.getDeadline() != null) {
            t.setDeadline(newTaskItem.getDeadline());
        }


        return true;
    }

    @Override
    public boolean deleteTask(UUID id) {
        return tasksList.removeIf(taskItem -> taskItem.getId().equals(id));
    }

    @Override
    public List<TaskItem> getAllTasksList() {
        return new ArrayList<>(tasksList);
    }

}