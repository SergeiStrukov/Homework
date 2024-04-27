package org.ClassWork19_04_24;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "sfsdf@gfdsdfs");
        System.out.println(extractEmails(list));
    }

    public static List<String> extractEmails(List<String> original) {
        List<String> resultList = new ArrayList<>();
        for (String s : original) {
            if (s.contains("@")) {
                resultList.add(s);
            }
        }
        return resultList;
    }
}
