package day10;

import java.util.Random;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        String str=sc.next();
        String result="";
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++) {
            int num = r.nextInt(str.length());
            if (!Contain(arr, str.charAt(num))) {
                arr[i] = str.charAt(num);
                result+=arr[i];
            }
            else{
                i--;
            }
        }
        System.out.println(result);

    }
    public static boolean Contain(char[] arr,char c){
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]==c){
                 return true;
             }
        }
        return flag;
    }
}
