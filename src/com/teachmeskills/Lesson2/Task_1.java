package com.teachmeskills.Lesson2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Task_1:");
        int b=5 ,c=7;
        int a=4*(b+c-1);
        System.out.println("a= "+a);

        System.out.println("Task_2:");
        System.out.println("Enter the number like xx:");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int d=n/10;
        int e=n%10;
        int sum2=d+e;
        System.out.println("Sum of numbers= "+sum2);

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