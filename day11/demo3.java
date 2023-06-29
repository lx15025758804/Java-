package day11;

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<Worker> list=new ArrayList<>();
        Worker w1=new Worker("张三",3000);
        Worker w2=new Worker("李四",3500);
        Worker w3=new Worker("王五",4000);
        Worker w4=new Worker("赵六",4500);
        Worker w5=new Worker("田七",5000);
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        for (int i = 0; i < list.size(); i++) {
            Worker wo=list.get(i);
            String name=wo.getName();
            if(name.equals("王五")){
                wo.setName("王小五");
                list.set(i,wo);
            }
            else if(name.equals("赵六")){
                list.remove(i--);
            }
            else if(name.equals("田七")){
                wo.setSalary(wo.getSalary()+500);
                list.set(i,wo);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Worker w=list.get(i);
            System.out.println("姓名："+w.getName()+"，"+"工资:"+w.getSalary());
        }
    }
}
