package day7;

import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        char[]arr=new char[52];
        for(int i=0;i<52;i++){
            if(i<=25){//小写字母
                arr[i]=(char) (97+i);
            }
            else{//大写字母
                arr[i]=(char) (65+i-26);
            }
        }
        String res="";
        Random r=new Random();
        for(int i=0;i<4;i++){
            int num=r.nextInt(arr.length);
            res+=(arr[num]);
        }
        int number=r.nextInt(10);
        res+=(number);
        System.out.println(res);
    }
}
