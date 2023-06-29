package day5;

import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        Random r=new Random();
        int []arr=new int [6];
        for(int i=0;i<6;i++)
        {
            int num=r.nextInt(100);
            System.out.print(num+" ");
            arr[i]=num;
        }
        int sum=0;
        System.out.println();
        for(int i=0;i<6;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
