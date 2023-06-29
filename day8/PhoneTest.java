package day8;

public class PhoneTest {
    public static void main(String[] args) {
        Phone ph=new Phone();
        ph.setBrand("小米");
        ph.setColor("黑色");
        ph.setPrice(3998);
        ph.call();
        ph.sendMessage();

    }
}
