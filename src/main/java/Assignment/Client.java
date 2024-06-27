package Assignment;

import java.util.Iterator;
import java.util.Stack;

public class Client {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Make a call to display method as per question requirements here
//        CLient.display(st);

        C obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        System.out.println(obj.d2);
//        System.out.println(obj.d2);
        obj.fun1();
        obj.fun();
        obj.sfun();

//        C obj = (C) new P();
//        System.out.println(obj.d1);
//        System.out.println(obj.d);
//        obj.fun1();
//        obj.fun();
//        obj.sfun();

    }

    // Write the display method as per requirements of question here

    public static void display(Iterable<?> stk) {
//    Itrator itr = stk.iterator();
        Iterator itr = stk.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
