package day7;

public class demo4 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int[] brr=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            brr[i]=arr[i];
        }
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
    }
}
