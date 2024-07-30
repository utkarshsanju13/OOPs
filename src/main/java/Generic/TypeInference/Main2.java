package Generic.TypeInference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Serializable s = pick("d",new ArrayList<String>());
        System.out.println(s);
        Throwable t = new Throwable();
        RuntimeException r = new RuntimeException();
        Error error = new Error();
    }

    public static <T> T pick(T a1, T a2) {
        return a1;
    }
}
