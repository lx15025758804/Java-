package day7;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入飞机票原价：");
        int price=sc.nextInt();
        System.out.println("输入月份：");
        int month=sc.nextInt();
        System.out.println("选择经济舱（0）和头等舱（1）");
        int seat=sc.nextInt();

        if(5<=month && month<=10){
            price= getPrice(seat,price,0.85,0.9);
        }
        else if((1<=month && month<=4) || (month>=11 && month<=12)){
             price= getPrice(seat,price,0.65,0.7);
        }
        else{
            System.out.println("月份输入有误！");
        }
        System.out.println(price);
    }
    public static int getPrice(int seat,int price,double v0,double v1){
        if(seat==0){
            price= (int) (price * v0);
        }
        else if(seat==1){
            price=(int) (price * v1);
        }
        else{
            System.out.println("没有该舱位!");
        }
        return price;
    }
}
