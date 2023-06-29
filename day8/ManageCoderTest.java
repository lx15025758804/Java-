package day8;

public class ManageCoderTest {
    public static void main(String[] args) {
        Manager ma=new Manager("张三",123,15000,6000);
        Coder co=new Coder("李四",135,10000);
        ma.work();
        co.work();
    }
}
