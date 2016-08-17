package base;

import java.util.Arrays;

/**
 * Created by mahendra.chhimwal on 6/27/2016.
 */
public class Anagram {

    public static void main(String[] args) {
        String string1 = "Hello dear friend 121";
        String string2 = "hello dear  p121ferd";
        System.out.println();
        System.out.println("Testing whether the following "
                + "strings are anagrams:");
        System.out.println("    String 1: " + string1);
        System.out.println("    String 2: " + string2);
        System.out.println();
        if (areAnagrams(string1, string2)) {
            System.out.println("They ARE anagrams!");
        } else {
            System.out.println("They are NOT anagrams!");
        }
        System.out.println();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    private static boolean areAnagrams(String string1, String string2) {
        string1 =string1.replaceAll(" ","");
        string2 = string2.replaceAll(" ", "");

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        StringBuilder source = new StringBuilder(string1);
        StringBuilder dest = new StringBuilder(string2);
        if(dest.length()>source.length()){
            return false;
        }
        for (int i = 0; i < dest.length(); i++) {
            char ch  = dest.charAt(i);
            int sourceIndex = source.indexOf(""+ch);
            if(sourceIndex >=0){
                source.deleteCharAt(sourceIndex);
            }else {
                return false;
            }
        }
        return true;
    }
}
