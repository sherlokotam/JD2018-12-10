package by.it.yarmolenka.MathCalc_v1_severalCalcuations_singleBrackets_Exceptions;

import java.io.File;

public class GetPath {
    public static String getPath(Class<?> clazz) {
        String path = clazz.getName().replace(".", File.separator)
                .replace(clazz.getSimpleName(), "");
        return System.getProperty("user.dir") + File.separator + "src" + File.separator + path;
    }
}