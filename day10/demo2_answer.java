package day10;

import java.util.Random;
import java.util.Scanner;

public class demo2_answer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("请输入一个字符串");
        String str=sc.next();
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        String newStr=new String(arr);
        System.out.println("随机修改后的字符串为："+newStr);
    }
}
