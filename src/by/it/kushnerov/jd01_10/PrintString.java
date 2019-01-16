package by.it.kushnerov.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method elem: methods){
            String name = elem.getName();
            int elemModifiers = elem.getModifiers();
            if (!Modifier.isStatic(elemModifiers)){
                System.out.println(name);
            }
        }
    }
}
