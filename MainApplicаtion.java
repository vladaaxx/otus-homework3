package ru.otus.java.homework.third;

import java.util.Arrays;

public class MainApplication {
    public static void sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void zeroOutDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                arr[i][arr.length - 1 - i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }

    public static void sumOfSecondRow(int[][] arr) {
        if (arr.length > 1) {
            int sum = 0;
            for (int i = 0; i < arr[1].length; i++) {
                sum += arr[1][i];
            }
            System.out.println(sum);
        } else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int[][] array = {{-2, 5, 8}, {3, -4, 7}, {1, 0, -6}};
        sumOfPositiveElements(array);
        printSquare(5);
        zeroOutDiagonal(array);
        int[][] array1 = {{-2, 5, 8}, {3, -4, 7}, {1, 0, -6}};
        findMax(array1);
        sumOfSecondRow(array1);
    }
}
