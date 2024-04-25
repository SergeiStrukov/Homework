package org23_04_24;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(getFibonachi(7));
    }

    public static int getFibonachi(int index) {
        int sum = 0;
        int x1 = 0;
        int x2 = 1;

        if (index == 0 || index == 1) {
            return index;
        }

        for (int i = 1; i < index; i++) {
            sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
        return sum;
    }
//    public static void main(String[] args) {
////        0 1 1 2 3 5 8 13 21 34 55 89
//    }
}
