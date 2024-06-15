package org._2024_05_14;

public class FI_4 {
    public static void main(String[] args) {

        System.out.println(m2((str, i) -> str + i, "888", 888));

    }

    public static String m2(Inter77 inter77, String str, int i) {

        return inter77.add(str, i);
    }
}

@FunctionalInterface
interface Inter77 {
    String add(String a, int b);

    static void asd() {

    }

    default void sss() {

    }
}