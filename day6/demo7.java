package day6;

public class demo7 {
    public static void main(String[] args) {
    int []arr={1,2,3,4,5,6,7,5};
    for(int i=0;i<arr.length;i++)
       {
            System.out.print(arr[i]+" ");
        }
    fill(arr,0);
    System.out.println();
    for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
    public static void fill(int []arr,int value){
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=value;
        }
    }
}
