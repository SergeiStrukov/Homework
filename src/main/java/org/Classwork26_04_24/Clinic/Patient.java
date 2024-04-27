package org.Classwork26_04_24.Clinic;

public class Patient {
    //    1 Создать класс Patient
    //2 Сделать парсер из строки в Patient
    //3 Сделать картотеку, которая находит пациентов по id или имени и фамилии.
    private int id;
    private String name;
    private String Surname;


    public Patient() {
        this.id = id;
        this.name = name;
        String surname;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
