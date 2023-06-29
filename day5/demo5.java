package day5;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        System.out.println("输入分数");
        double sum=0;
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("平均成绩为"+sum/arr.length);
    }
}
