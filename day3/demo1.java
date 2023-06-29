package day3;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("请输入父亲和母亲的身高");
        Scanner sc=new Scanner(System.in);
        System.out.print("父亲：");
        double father=sc.nextDouble();
        System.out.print("母亲：");
        double mother=sc.nextDouble();
        double son=(mother+father)*1.08/2;
        double daughter=(father*0.923+mother)/2;
        System.out.println("儿子的身高为："+son+"cm");
        System.out.println("女儿的身高为："+daughter+"cm");
    }
}
