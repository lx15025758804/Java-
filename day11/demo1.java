package day11;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        String a="aaa";
        String b="bbb";
        String c="ccc";
        al.add(a);
        al.add(b);
        al.add(a);
        al.add(a);
        al.add(c);
        al.add(b);
        for (int i = 0; i < al.size(); i++) {
            String st=al.get(i);
            System.out.println(st);
        }
    }
}
