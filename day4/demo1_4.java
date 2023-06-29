package day4;

import java.util.Scanner;

public class demo1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入顾客类别(0或1)");
        int customer=sc.nextInt();
        System.out.println("请输入消费金额");
        int money=sc.nextInt();
        double num=money;
        if(customer==1)
        {
            if(money<200)
                num=money*0.8;
            else
                num=money*0.7;
        }
        else
        {
            if(money>=100)
                num=money*0.9;
        }
        System.out.println("需要支付的金额为："+num);
    }
}
