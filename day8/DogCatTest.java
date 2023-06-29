package day8;

public class DogCatTest {
    public static void main(String[] args) {
        Cat c=new Cat("花色","波斯猫");
        Dog d=new Dog("黑色","藏獒");
        c.eat();
        c.catchMouse();
        d.eat();
        d.lookHome();
    }
}
