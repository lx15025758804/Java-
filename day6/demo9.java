package day6;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("请输入一个大小为"+n+"的数组");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        System.out.println("一个新的大小为"+m+"的数组");
        int []brr=copy(arr,m);
        for(int i=0;i<m;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
    public static int[] copy(int[]arr,int newlength){
        int[]brr=new int[newlength];
        for(int i=0;i<newlength;i++)
        {
            brr[i]=arr[i];
        }
        return brr;
    }
}
