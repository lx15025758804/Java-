package day9;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu=new Student[3];
        Student stu1=new Student(1,"李白",30);
        Student stu2=new Student(2,"杜甫",20);
        Student stu3=new Student(3,"王维",50);
        Student stu4=new Student(4,"苏轼",80);
        stu[0]=stu1;
        stu[1]=stu2;
        stu[2]=stu3;
        boolean flag=contain(stu,stu4.getId());
        //id不重复
        if(!flag){
            int count=getCount(stu);
            //数组未满
            if(count<stu.length){
                stu[count]=stu4;
                printArr(stu);
            }
            //数组满了
            else{
             Student[] newStu=creatNew(stu);
             newStu[count]=stu4;
             printArr(newStu);
            }
        }
        //id重复
        else{
            System.out.println("id重复");
        }
        //删除操作
        deleteArr(stu,1);
        printArr(stu);
        for (int i = 0; i < stu.length; i++) {
            if(stu[i]!=null) {
                if (stu[i].getId() == 2) {
                    int age = stu[i].getAge();
                    stu[i].setAge(age + 1);
                }
            }
        }
        printArr(stu);
    }





    //函数
    //判断id是否已经重复
    public static boolean contain(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(arr[i]!=null) {
                int sid = arr[i].getId();
                if (sid==id) {
                    return true;
                }
            }
        }
        return false;
    }
    //求出已经存入的数量
    public static int getCount(Student[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    //创建新的数组
    public static Student[] creatNew(Student[]arr) {
        Student[] brr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
    //打印数组
    public static void printArr(Student[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
            System.out.println(arr[i].getId()+":"+arr[i].getName()+","+arr[i].getAge()+"岁");
        }
    }
   //删除数据
    public static void deleteArr(Student[]arr,int id){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    arr[i]=null;
                    break;
                }
            }
        }
    }


}
