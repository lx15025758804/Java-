package day10;

public class demo7 {
    public static void main(String[] args) {
      int[]arr={1,2,3};
      String str=exchange(arr);
        System.out.println(str);
    }
    public static String exchange(int[]arr){
        if (arr == null) {
            return null;
        }
        StringBuilder sb=new StringBuilder();
        sb.append('[');
        for(int i=0;i<arr.length;i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(',');
            }
        }
        sb.append(']');
         String result=sb.toString();
        return result;
    }

}
