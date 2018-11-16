import entity.Person;

public class Equal {
    public static void main(String [] args) {
        Person p1 = new Person("xiaowang", 12);
        Person p2 = new Person("xiaowang", 11);
        System.out.println(p1.equals(p2));
        //lombok默认实现equals方法全参数相等
    }
}
