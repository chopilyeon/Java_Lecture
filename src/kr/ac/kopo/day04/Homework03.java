package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 5개를 입력하세요. 짝수만 골라줄 것입니다");


       int[] arr;
        arr = new int[5];
/*
        for(int i=0;i<arr.length;i++){
            arr
        }
*/
        /*int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            do {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    arr[i] = a;
                    sum +=sum;
                }
            } while (sum == i+1);
           이러면 왜 문제가 될까?
        */
      /*  while(sum==i+1) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                arr[i] = a;
                sum += sum;
                */








                int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            do {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    arr[i] = a;
                    sum +=sum;
                }
            } while (sum == i+1);




                }


        /*


        /* 한번 배열 정의되면 수정 불가.
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) {
                do{
                    arr[i]=sc.nextInt();

                } while (arr[i] % 2 = 0);
            }
        }
           */


        System.out.println("<5개의 정수 출력>");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" " );
        }
    }
}