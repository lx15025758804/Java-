package day4;

import java.util.Scanner;

public class demo3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入被除数和除数");
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int shang=0;
        int yuShu=0;
        while(dividend>=divisor)
        {
            dividend=dividend-divisor;
            shang++;
        }
        yuShu=dividend;
        System.out.println("商："+shang+"  "+"余数："+yuShu);
    }
}
