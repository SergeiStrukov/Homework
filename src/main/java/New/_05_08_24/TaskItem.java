package New._05_08_24;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

//Пользователь должен иметь возможность создать новую задачу, указав следующие поля:
//Название задачи
//Описание задачи
//Дата и время создания (автоматически устанавливается на текущую дату и время)
//Дедлайн (дата и время, до которого задача должна быть выполнена)
//Временная зона пользователя
public class TaskItem {
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime createdDateTime;
    private LocalDateTime deadline;
    private ZoneId timeZone;

    public TaskItem(String title, String description, LocalDateTime deadline) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.createdDateTime = LocalDateTime.now();
        this.deadline = deadline;
        this.timeZone = ZoneId.of("Asia/Kuala_Lumpur");
    }


    public UUID getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setTimeZone(ZoneId timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "TaskItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDateTime=" + createdDateTime +
                ", deadline=" + deadline +
                ", timeZone=" + timeZone +
                '}';
    }
}
