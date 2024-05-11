package org.ClassWork19_04_24;

public class Person {
    String question;

    public Person(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Person{" +
                "question='" + question + '\'' +
                '}';
    }
}
