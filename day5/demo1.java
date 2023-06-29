package day5;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int [] arr=new int [6];
        System.out.println("请输入6个整数");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("输出");
        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
