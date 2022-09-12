package strings;

import java.util.Locale;

public class ManioulandoStrings {
    public static void main(String[] args) {
        String original = " asd, DFED, dep, ERT ";
        System.out.println(original);
        System.out.println(original.toUpperCase());
        System.out.println(original.toLowerCase());
        System.out.println(original.trim());
        System.out.println(original.substring(5));
        System.out.println(original.substring(5, 9));
        System.out.println(original.replace(',','-').trim());
        System.out.println(original.indexOf('a'));
        System.out.println(original.indexOf("ERT"));
        String[] vect = original.split(",");
        for(String s : vect){
            System.out.printf("- %s%n", s);
        }
    }
}
