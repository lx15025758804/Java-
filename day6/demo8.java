package day6;

public class demo8 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,5};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        fill(arr,1,4,0);

        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void fill(int []arr,int from, int to,int value){
        for(int i=from;i<to;i++) {
            arr[i]=value;
        }
    }
}
