package day4;

import java.util.Scanner;

public class demo3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入范围");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;
        int sum=0;
        for(int i=min;i<=max;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
