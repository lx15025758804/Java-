package day7;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入原始密码");
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
        for(int i=0;i<arr.length;i++){
            arr[i]+=5;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]%=10;
        }
        int res=0;
        for(int i=arr.length-1;i>=0;i--){
            res=res*10+arr[i];
        }
        System.out.println("加密后的密码："+res);
    }
}
