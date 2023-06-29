package day4;

import java.util.Scanner;

public class demo1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个整数");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int min;
        if(a<=b){
            if(a<=c)
                min=a;
            else
                min=c;
        }
        else{
            if(b<=c)
                min=b;
            else
                min=c;
        }
        System.out.println("最小的数是："+min);
    }
}
