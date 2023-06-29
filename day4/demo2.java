package day4;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("输入需要进行的算术运算（加法1，减法2，乘法3，除法4）");
        int option=sc.nextInt();
        int res=0;
        switch (option)
        {
            case 1:
                res=a+b;
                break;
            case 2:
                res=a-b;
                break;
            case 3:
                res=a*b;
                break;
            case 4:
                res=a/b;
                break;
        }
        System.out.println("运算结果为："+res);
    }
}
