package day9;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] ph=new Phone[3];
        Phone p1=new Phone("苹果","白色",5999);
        Phone p2=new Phone("小米","黑色",1999);
        Phone p3=new Phone("OPPO","绿色",3999);
        ph[0]=p1;
        ph[1]=p2;
        ph[2]=p3;
        int sum=0;
        for (int i = 0; i < ph.length; i++) {
            System.out.println(ph[i].getPrice());
            sum+=ph[i].getPrice();
        }
        int ave=sum/ph.length;
        System.out.println("平均价格为"+ave);
    }
}
