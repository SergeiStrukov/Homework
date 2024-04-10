package org.example_Classwork;

import java.util.Random;

public class NewArray {
    public static void main(String[] args) {
        int[][] array = getArray(4, 6);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getArray(int high, int width) {
        Random random = new Random();
        int[][] newArray = new int[high][width];
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                newArray[i][j] = random.nextInt(100);
            }
        }
        return newArray;
    }
}
