package day10;

import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        Random r=new Random();
        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<26){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }
        String result="";
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(chs.length);
            result+=chs[index];
        }
        int numb=r.nextInt(10);
        result=result+numb;
        char[] arr=result.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        String newResult=new String(arr);
        System.out.println(newResult);
    }
}
