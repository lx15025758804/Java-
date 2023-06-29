package day7;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入加密后的密码");
        int ori=sc.nextInt();
        int num=ori;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        int[] arr=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=ori%10;
            ori/=10;
        }
        //反转
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0 && arr[i]<=4){
                arr[i]+=10;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]-=5;
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res*10+arr[i];
        }
        System.out.println("解密后的密码为"+res);
    }
}
