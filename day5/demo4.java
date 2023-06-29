package day5;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组的元素个数");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("输入数组元素");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num=0;
        for(int i=0;i<n;i++)
        {
            num=num*10+arr[i];
        }
        System.out.println("最后的整数是");
        System.out.println(num);

    }
}
