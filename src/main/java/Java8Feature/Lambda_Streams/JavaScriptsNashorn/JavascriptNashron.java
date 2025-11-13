package Java8Feature.Lambda_Streams.JavaScriptsNashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavascriptNashron {

    public static void main(String[] args)  {
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("nashorn");

        try{
            ee.eval(new FileReader("geeks.js"));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
