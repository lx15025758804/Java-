package day6;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("第一个数:");
        int a=sc.nextInt();
        System.out.print("第二个数:");
        int b=sc.nextInt();
        System.out.print("第三个数:");
        int c=sc.nextInt();
        method(a,b,c);


    }
    public static void method(int a,int b,int c) {
        int max=b>=(a>=c?a:c)? b:(a>=c?a:c);
        int min=a<=(b<=c?b:c)? a:(b<=c?b:c);
        int mid=a+b+c-max-min;
        System.out.println("从大到小的顺序："+max+" "+mid+" "+min);
    }

}
