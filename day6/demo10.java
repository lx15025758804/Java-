package day6;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("请输入一个大小为"+n+"的数组");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=b-a;
        System.out.println("一个新的大小为"+c+"的数组");
        int []brr=copy(arr,a,b);
        for(int i=0;i<c;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
    public static int[] copy(int[]arr,int from,int to){
        int[]brr=new int[to-from];
        int j=0;
        for(int i=from;i<to;i++)
        {
            brr[j++]=arr[i];
        }
        return brr;
    }
}
