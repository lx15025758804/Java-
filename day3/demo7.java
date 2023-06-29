package day3;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ones=num%10;
        int ten=num/10%10;
        int bai=num/100%10;
        int sum=ones+ten+bai;
        System.out.println("每一位相加得："+sum);
    }
}
