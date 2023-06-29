package day5;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数字长度");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("输入数组元素");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            if(arr[left]%2==0 && arr[right]%2!=0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2!=0)
            {
                left++;
            }
            if(arr[right]%2==0)
            {
                right--;
            }
        }
        System.out.println("结果");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
