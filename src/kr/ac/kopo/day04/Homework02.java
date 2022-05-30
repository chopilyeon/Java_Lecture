package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int[] arr;

        arr = new int[10];


        System.out.print("10개의 정수를 입력하시오");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("<짝수>");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }



        }
        System.out.printf("짝수의 총합:%d\n", sum1);
        System.out.printf("홀수의 총합:%d", sum2);

    }


}