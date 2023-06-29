package day6;

public class demo6 {
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9};
        int []brr={0,23};
        equal(arr,brr);
    }
    public static void equal(int[]arr,int[]brr) {
        if (arr.length != brr.length) {
            System.out.println("两个数组不相等");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != brr[i]) {
                    System.out.println("两个数组不相等");
                    break;
                }
            }
            System.out.println("两个数组相等");
        }
    }
}
