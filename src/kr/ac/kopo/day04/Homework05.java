package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Left(-),Right(+) 둘 중에 하나 입력");
        System.out.println("인덱스를 입력하세요 0-4");


        char direction = sc.nextLine().charAt(0);
        int index = sc.nextInt();


        int[] nums = {1, 2, 3, 4, 5};

        if (direction == '-') {
            for (int i = 0; i < nums.length; i++) {
                if (index - i - 1 < 0) {
                    System.out.print(nums[index - i - 1 + 5] );
                } else {
                    System.out.print(nums[index - i - 1] );
                }
            }
        } else if (direction == '+') {
            for (int i = 0; i < nums.length; i++) {
                if (index + 1 + i < 5) {
                    System.out.print(nums[index + 1 + i]);
                }else{
                    System.out.print(nums[index + 1 + i - 5]);
                }
            }

        }
    }
}