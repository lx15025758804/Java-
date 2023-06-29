package day3;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=(a+b)%6;
        boolean out= (a==6 || b==6 || res==0) ?true:false;
        System.out.println(out);
    }
}
