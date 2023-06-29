package day3;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("红茶妹妹之前有21元，绿茶妹妹之前有24元");
        int red=21*2+2;
        int green=24*2;
        boolean isame= red==green?true:false;
        System.out.println("她们现在的钱一样多？");
        System.out.println(isame);
    }
}
