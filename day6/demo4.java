package day6;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        double res=abs(num);
        System.out.println("绝对值："+res);
    }
    public static double abs(double num){
        if(num<0)
            return -num;
        else
            return num;
    }
}
