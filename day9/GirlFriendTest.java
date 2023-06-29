package day9;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] gi=new GirlFriend[4];
        GirlFriend g1=new GirlFriend("小花",18,"女","吃饭");
        GirlFriend g2=new GirlFriend("小红",19,"女","睡觉");
        GirlFriend g3=new GirlFriend("小白",20,"女","锻炼");
        GirlFriend g4=new GirlFriend("小黑",21,"女","打球");
        gi[0]=g1;
        gi[1]=g2;
        gi[2]=g3;
        gi[3]=g4;
        int sum=0;
        int count=0;
        for (int i = 0; i < gi.length; i++) {
            sum+=gi[i].getAge();
        }
        int ave=sum/gi.length;
        System.out.println("平均年龄为"+ave);
        for (int i = 0; i < gi.length; i++) {
            if(gi[i].getAge()<ave){
                System.out.println(gi[i].getName()+"，年龄"+gi[i].getAge()+"，性别"+gi[i].getGender()+",爱好："+gi[i].getHobby());
                count++;
            }
        }
        System.out.println("低于平均年龄的人有"+count+"个");
    }
}
