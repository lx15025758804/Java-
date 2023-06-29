package day4;

public class demo1_1 {
    public static void main(String[] args) {
        int buy=7988;
        int sell=1500;
        int way1=buy-sell;
        double way2=buy*0.8;
        if(way1<way2){
            System.out.println("选择将手机卖掉更省钱  "+way1);
        }
        else if(way1>way2){
            System.out.println("选择将手机交给店家更省钱  "+way2);
        }
        else {
            System.out.println("两种方案一样");
        }

    }
}
