package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int [] arr;
        arr=new int [5];


        int sum=0;
        for(int i=0;i<arr.length;i++){
            int a=sc.nextInt();

            do{
                arr[i]=a;
            }while(sum==i+1);

        }

        int a=sc.nextInt();






    }
}
