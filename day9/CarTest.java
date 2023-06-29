package day9;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car[] ca=new Car[3];
        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();
        ca[0]=c1;
        ca[1]=c2;
        ca[2]=c3;
        for(int i=0;i<ca.length;i++){
            System.out.println("输入汽车品牌");
            String name=sc.next();
            ca[i].setBrand(name);
            System.out.println("输入汽车价格");
            int price=sc.nextInt();
            ca[i].setPrice(price);
            System.out.println("输入汽车颜色");
            String color=sc.next();
            ca[i].setColor(color);
        }
        for(int i=0;i<ca.length;i++){
            System.out.println(ca[i].getBrand()+ca[i].getPrice()+ca[i].getColor());
        }
    }
}
