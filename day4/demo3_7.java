package day4;

public class demo3_7 {
    public static void main(String[] args) {
        for(int i=1988;i<=2019;i++)
        {
            if(i%400==0 || (i%4==0 && i%100!=0))
                System.out.println(i);
        }
    }
}