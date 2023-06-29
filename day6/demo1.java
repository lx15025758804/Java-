package day6;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数字");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("较小的一个数是 "+getMin(a,b));
    }

    public static double getMin(double a,double b) {
        return a>b?b:a;
    }
}
