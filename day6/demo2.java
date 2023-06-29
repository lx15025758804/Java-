package day6;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res=getMax(a,b,c);
        System.out.println(res);

    }
    public static int getMax(int a,int b,int c) {
        if(a>=b && a>=c)
        {
            return a;
        }
        else if(b>=a && b>=c)
        {
            return b;
        }
        else
            return c;

    }

}
