package org.example.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class replacingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        int [] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 ){
                array[i] = indexCount(array);
                System.out.print(Arrays.toString(array));
            }
        }
        System.out.println();
    }

    public static int indexCount(int [] arr) {
        int sum = 0;
        int min = 9;
        int max = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < max){
                sum += i;
            }
        }
        return sum;
    }


}