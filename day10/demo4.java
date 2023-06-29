package day10;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int charCount=0;
        int numCount=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c>='a' && c<='z'){
                charCount++;
            } else if (c>='A'&& c<='Z') {
                charCount++;
            } else if (c>='0'&&c<='9') {
                numCount++;
            }
        }
        System.out.println("字母数量为："+charCount+"  数字数量为："+numCount);
    }
}
