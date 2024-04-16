package org.example16_04_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main { //
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        System.out.println(getUniqDigit(list));
        System.out.println(getUniqDigit(list2));
    }
    public static List<Integer> getUniqDigit(List<Integer> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; ) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                list.remove(i + 1);
            } else {
                i++;
            }
        }
        return list;
    }
}
