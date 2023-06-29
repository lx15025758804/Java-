package day7;

import java.util.Random;

public class demo8 {
    public static void main(String[] args) {
        int[]arr={2,588,888,1000,10000};
        int[]brr=new int[arr.length];
        int index=0;
        Random r=new Random();
        while(index<arr.length) {
            int k=r.nextInt(arr.length);
            boolean res=decide(brr,arr[k]);
            if(!res){
                System.out.println(arr[k]+"的奖金被抽出");
                brr[index]=arr[k];
                index++;
            }
        }
    }
    public static boolean decide(int[]brr,int value){
        boolean flag= false;
        for(int i=0;i<brr.length;i++)
        {
            if(brr[i]==value) {
                flag = true;
            }
        }
        return flag;
    }
}
