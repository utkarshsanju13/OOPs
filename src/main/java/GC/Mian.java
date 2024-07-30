package GC;

import Assignment.P;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Mian {



    public static void main(String[] args) {

        Person p = new Person();
        WeakReference<Person> weakReference = new WeakReference<>(new Person());
        SoftReference<Person> softReference = new SoftReference<>(new Person());

    }
}
