package org.example.HW1;

import java.util.Scanner;

public class sumPrimeNum {

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
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (simpleNum(array[i]) == 1) {
                sum += array[i];
            }
                System.out.println(sum);

        }
        System.out.println();
    }
        private static int simpleNum(int n){
            for (int i=2; i<n; i++) {
                if (n%i == 0) {
                    return 0;
                }
                if ((i==n) || (i>Math.sqrt(n))) {
                    return 1;
                }
            }
            return 0;
    }
}


