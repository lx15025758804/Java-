package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        //主菜单
        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------图书管理系统---------------------------");
            System.out.println("1.添加图书");
            System.out.println("2.查询所有图书");
            System.out.println("3.查询单个图书");
            System.out.println("4.删除图书");
            System.out.println("5.修改图书信息");
            System.out.println("6.退出系统");
            System.out.println("----------------");
            System.out.print("输入需要进行的操作：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addBook(list);
                    break;
                case "2":
                    searchAll(list);
                    break;
                case "3":
                    searchOne(list);
                    break;
                case "4":
                    deleteBook(list);
                    break;
                case "5":
                    alterBook(list);
                    break;
                case "6":
                    System.out.println("退出系统");
                    break loop;
                default:
                    System.out.println("没有该操作！！！");
                    break;
            }
        }
    }
        //1.添加图书操作
        public static void addBook(ArrayList<Book> list){
            Book b=new Book();
            Scanner sc=new Scanner(System.in);
            String id;
            while(true) {
                System.out.print("请输入图书id:");
                id = sc.next();
                if(decide(list,id)){
                    System.out.println("id已经存在，请重新输入");
                }
                else {
                    b.setId(id);
                    break;
                }
            }

            System.out.print("输入图书名：");
            String name=sc.next();
            b.setName(name);

            System.out.print("输入图书作者：");
            String author=sc.next();
            b.setAuthor(author);

            System.out.print("输入价格：");
            String price=sc.next();
            b.setPrice(price);

            list.add(b);
            System.out.println("图书信息添加成功！");
        }
        //2.查询所有图书
        public static void searchAll(ArrayList<Book>list){
            System.out.println("id\t书名\t\t作者\t\t价格");
            for (int i = 0; i < list.size(); i++) {
                Book b=list.get(i);
                System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getAuthor()+"\t"+b.getPrice());
            }
        }
        //3.查询单个图书
        public static void searchOne(ArrayList<Book>list){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入要查找的书名：");
        String name=sc.next();
        boolean flag=false;
        System.out.println("id\t书名\t\t作者\t\t价格");
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.getName().equals(name)) {
                flag=true; //图书存在
                System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
            }
        }
         //图书不存在
        if(!flag){
            System.out.println("所查找的图书不存在！！！");
        }
    }
        //4.删除图书
        public static  void deleteBook(ArrayList<Book>list){
            Scanner sc=new Scanner(System.in);
            System.out.print("输入需要删除的图书编号：");
            String id=sc.next();
            boolean flag=decide(list,id);//看所需要删除的图书是否存在
            //存在
            if(flag){
                for (int i = 0; i < list.size(); i++) {
                    Book b=list.get(i);
                    if(b.getId().equals(id)){
                        list.remove(i);
                        System.out.println("删除成功！");
                        break;
                    }
                }
            }
            //不存在
            else{
                System.out.println("需要删除的图书不存在！！！");
            }

         }
         //5.修改图书信息
        public static void alterBook(ArrayList<Book>list){
          Scanner sc=new Scanner(System.in);
          System.out.print("输入需要修改的图书编号：");
          String id=sc.next();
          boolean flag=decide(list,id);
          if(flag){
              Book newlist=new Book();
              int index1=index(list,id);
              System.out.print("修改后的书名：");
              String newName=sc.next();
              newlist.setName(newName);

              System.out.print("修改后的作者：");
              String newAuthor=sc.next();
              newlist.setAuthor(newAuthor);

              System.out.print("修改后的价格：");
              String newPrice=sc.next();
              newlist.setPrice(newPrice);
              newlist.setId(id);

              list.set(index1,newlist);
              System.out.println("修改成功！");

          }
          else{
              System.out.println("该图书不存在！！！");
          }
    }

        //判断id是否唯一
        public static boolean decide(ArrayList<Book>list,String id){
        for (int i = 0; i < list.size(); i++) {
            Book b=list.get(i);
            String newId=b.getId();
            if(newId.equals(id)){
                return true;
            }
        }
        return false;
    }
        //得到修改图书在集合中的索引
        public static int index(ArrayList<Book>list,String id){
           for (int i = 0; i < list.size(); i++) {
               Book b=list.get(i);
               String newId=b.getId();
               if(newId.equals(id)){
                   return i;
               }
           }
           return -1;
       }
}
