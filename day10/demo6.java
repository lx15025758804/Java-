package day10;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入身份证号码");
        String str=sc.next();
        if(decide(str)){
            System.out.println(str);
        }else {
            System.out.println("身份证不合法");
        }

    }
    public static boolean decide(String str){
        if(str.length()!=18){
            return false;
        }
        if(str.charAt(0)=='0'){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c>='0'&&c<='9'){
                continue;
            }
            else if((i==str.length()-1) && (str.charAt(i)=='X')){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
