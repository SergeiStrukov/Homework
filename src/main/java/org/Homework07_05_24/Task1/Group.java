package org.Homework07_05_24.Task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString
public class Group implements Comparable<Group> {
    //    Задание 5: Применение Comparator в сложных структурах данных
//    Тема: Продвинутое использование Comparator.
//            Описание: Создайте класс Group, содержащий название группы и список студентов.
//    Реализуйте сортировку групп по названию, а студентов внутри каждой группы —
//    по возрасту, используя Comparator. В main создайте несколько групп с студентами,
//    выполните сортировку и отобразите результат.
    private String groupName;
    private List<Student> students;

    public Group(String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }

    @Override
    public int compareTo(Group otherGroup) {
//        return otherGroup.getGroupName().compareTo(this.groupName);
        return this.getGroupName().compareTo(otherGroup.groupName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(groupName, group.groupName) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, students);
    }
}
