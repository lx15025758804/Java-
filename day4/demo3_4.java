package day4;

import java.util.Scanner;

public class demo3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数");
        int num1= sc.nextInt();
        int num2=num1;
        int res=0;
        while(num1!=0)
        {
            int a=num1%10;
            res=res*10+a;
            num1/=10;
        }
        //System.out.println(res);
        if(res==num2)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
