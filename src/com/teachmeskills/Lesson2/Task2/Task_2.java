package com.teachmeskills.Lesson2.Task2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println("Task_2:");
        System.out.println("Enter the number like xx:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = n / 10;
        int e = n % 10;
        int sum2 = d + e;
        System.out.println("Sum of numbers= " + sum2);

    }

}