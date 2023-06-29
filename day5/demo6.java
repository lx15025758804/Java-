package day5;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc = new Scanner(System.in);
        int[] brr = new int[11];
        int num = sc.nextInt();
        int index=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]<num)
            {
                brr[i]=arr[i];
                index++;
            }
            else
            {
                brr[i+1]=arr[i];
            }
        }
        brr[index]=num;
        for(int i=0;i<11;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}
