package day4;
import java.util.Scanner;

public class demo3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入范围");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;
        int num=0;
        for(int i=min;i<=max;i++)
        {
            if(i%3==0 && i%5==0)
                num++;
        }
        System.out.println(num);
    }
}