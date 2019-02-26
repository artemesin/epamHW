package hw200219.common.solutions.utils;

public final class StringUtils {
    private StringUtils(){

    }
    public static boolean isBlank(String s){
        return s == null || s.isEmpty();
    }

    public static boolean notIsBlank(String s){
        return !isBlank(s);
    }
}
