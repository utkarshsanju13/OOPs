package JavaCollection.Map;

import Java8Feature.Lambda_Streams.Streams.Department;

import java.util.Comparator;
import java.util.TreeMap;

class User{
    public String name;
    public int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class TreeMapDemo {

    public static void main(String[] args) {
        Comparator<Integer> cmp = ((o1, o2) -> o2.compareTo(o1));
        //comparator that return the element in reverse order

        TreeMap<Integer, String > thm = new TreeMap<>(cmp);
        //passed the comparator as cmp in constructor
        thm.put(3,"namaste");
        thm.put(1,"hello");
        thm.put(4,"hanji");
        thm.put(2,"hey");

        System.out.println(thm);

        // Object as a key

        Comparator<User> cmpUser = ((user1,user2) -> {
            if(user1.id > user2.id){
                return 1;
            }else if(user1.id < user2.id){
                return -1;
            }
            return 0;
        });

        TreeMap<User, String> thmUser = new TreeMap<>(cmpUser);
        thmUser.put(new User("vivek",3),"namaste");
        thmUser.put(new User("utkarsh",1),"hello");
        thmUser.put(new User("sunny",2),"hey");


        System.out.println(thmUser);






    }
}
