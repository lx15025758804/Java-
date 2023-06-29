package day3;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double discout=(24+8+3)*0.8;
        int Youhui=16+8+3;
        String option= discout<Youhui?"打折":"优惠价";
        System.out.println(option);
    }
}
