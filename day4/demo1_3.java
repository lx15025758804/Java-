package day4;

import java.util.Scanner;

public class demo1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入本金(1000起)");
        int money=sc.nextInt();
        System.out.println("请输入年限（1年起）");
        int year=sc.nextInt();
        double liLv;
        double sum;
        if(year==1)
            liLv=0.0225;
        else if(year==2)
            liLv=0.027;
        else if(year==3)
            liLv=0.0325;
        else if(year==5)
            liLv=0.036;
        else {
            System.out.println("没有该业务");
            liLv=0;
        }
        sum=money+money*liLv;
        System.out.println("最后的总额为："+sum);
    }
}
