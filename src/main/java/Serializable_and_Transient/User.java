package Serializable_and_Transient;

import java.io.*;

public class User implements Serializable {

    public String name;
    public String username;
    transient String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User newUser = new User("annu","annu@gmail.com","cat");

        //Serialize the object
        FileOutputStream fileOutputStream = new FileOutputStream("user.sr");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(newUser);
        fileOutputStream.close();
        objectOutputStream.close();

        //Deserialize the object
        FileInputStream fileInputStream = new FileInputStream("user.sr");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User deserializeObj = (User)objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        // Print deserialized object
        System.out.println("Name: " + deserializeObj.name);
        System.out.println("Age: " + deserializeObj.username);
        System.out.println("Password: " + deserializeObj.password);




    }
}
