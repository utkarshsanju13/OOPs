package Comparable_Comparator;

import java.util.Comparator;
import java.util.TreeMap;

public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Comparator<User> cmpUser = ((user1, user2) -> {
           if(user1.age > user2.age)
               return 1;
           else if (user1.age < user2.age) {
               return -1;
           }else
               return 0;
        });

        TreeMap<User,String> map = new TreeMap(cmpUser);
        map.put(new User("utk",2),"hello");
        map.put(new User("vivk",3),"namste");
        map.put(new User("om",4),"om");

        System.out.println(map);
    }

}
