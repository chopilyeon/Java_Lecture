package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int arr[];
        arr = new int[5];

        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("<PRINT>");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        System.out.printf("총합:%d", sum);

    }


}