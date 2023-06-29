package day7;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        int[] sorce=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            sorce[i]=sc.nextInt();
        }
        int min=getMin(sorce);
        int max=getMax(sorce);
        int sum=getSum(sorce);
        int ave=(sum-min-max)/4;
        System.out.println("平均成绩："+ave);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static int getSum(int[] arr){
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
