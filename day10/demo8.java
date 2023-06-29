package day10;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int start=0;
        int index=0;
        int end=0;
        int count=0;
        String flag="Java";
        while((index=str.indexOf(flag))!=-1){
            str=str.substring(index+flag.length());
            count++;
        }
        System.out.println(count);
    }
}
