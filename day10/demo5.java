package day10;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=new char[str.length()];
        int j=0;
        for (int i = str.length()-1; i >=0; i--) {
            char c=str.charAt(i);
            arr[j++]=c;
        }
        String newStr=new String(arr);
        boolean flag=newStr.equals(str);
        System.out.println(str);
        System.out.println(newStr);
        if(flag){
            System.out.println("对称");
        }else{
            System.out.println("不对称");
        }
    }
}
