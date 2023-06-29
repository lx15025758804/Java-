package day6;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num=sc.nextInt();
        method(num);
    }
    public static void method(int num){
        int count=0;
        int a=num;
        while(a!=0)
        {
            a/=10;
            count++;
        }
        System.out.println(num+"是"+count+"位数");
    }
}
