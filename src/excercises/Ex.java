package excercises;

public class Ex {
    static public String frontBack(String str) {
        if (str.length()<2) return str;
        char last = str.charAt(0);
        char first =str.charAt(str.length()-1);
        return first + str.substring(1, str.length()-1)+last;
    }

}
