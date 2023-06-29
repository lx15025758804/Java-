package day4;

public class demo3_3 {
    public static void main(String[] args) {
        int num=0;
        double sum=0.1;
        while(sum<8844430)
        {
            sum*=2;
            num++;
        }
        System.out.println(num);
    }
}
