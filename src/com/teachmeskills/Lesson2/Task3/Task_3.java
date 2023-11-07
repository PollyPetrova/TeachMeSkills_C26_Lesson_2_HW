package com.teachmeskills.Lesson2.Task3;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Task_3:");
        System.out.println("Enter the number like xxx:");
        int nn = scanner.nextInt();
        int fir=nn/100;
        int add=nn%100;
        int sec=add/10;
        int tr=add%10;
        int sum3=fir+sec+tr;
        System.out.println("Sum of numbers= "+sum3);

    }
}