package day4;

import java.util.Scanner;

public class demo1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的工资");
        double money=sc.nextDouble();
        double sanXian=money*0.1;
        //工资减去三险一金
        money=money-sanXian;
        if(money>5000)
        {
            //工资减去三险一金后超出5000的部分
            double last=money-5000;
            if(0<last && last<=3000)//0-3000 交税3%
            {
                money=money-last*0.03;
            }
            else if(3000<last && last<=12000)//3000-12000 交税10%
            {
                last=last-3000;
                money=money-3000*0.03-last*0.1;
            }
            else if(12000<last && last<=25000)//12000-25000 交税20%
            {
                last=last-12000;
                money=money-3000*0.03-9000*0.1-last*0.2;
            }
            else if(25000<last && last<=35000)//25000-35000 交税25%
            {
                last=last-25000;
                money=money-3000*0.03-9000*0.1-13000*0.2-last*0.25;
            }
            else if(35000<last && last<=55000)//35000-55000 交税30%
            {
                last=last-35000;
                money=money-3000*0.03-9000*0.1-13000*0.2-10000*0.25-last*0.3;
            }
            else if(55000<last && last<=80000)//55000-80000 交税35%
            {
                last=last-55000;
                money=money-3000*0.03-9000*0.1-13000*0.2-10000*0.25-20000*0.3-last*0.35;
            }
            else //大于80000 交税45%
            {
                last=last-80000;
                money=money-3000*0.03-9000*0.1-13000*0.2-10000*0.25-20000*0.3-25000*0.35-last*0.45;
            }
        }

        System.out.println("到手金额为: "+money);
    }
}
