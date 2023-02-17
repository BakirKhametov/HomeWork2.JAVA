package org.example.HW2;

import java.util.Scanner;

public class increasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println("Последовательность  возрастающая");
            }
            else {
                System.out.println("Последовательность не возрастающая");
                break;
            }

        }
    }
}
