package regex;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mahendra.chhimwal on 7/25/2016.
 */
public class PatternUtil {

    public static void containsDigit(String input) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Input :" + input + " contains digits");
        } else {
            System.out.println("Input : " + input + " does not contains any disgits");
        }
    }

    public static void notContainsDigit(String input) {
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Input :" + input + ": does not contains digits");
        else {
            System.out.println("Input : " + input + ": contains any disgits");
        }
    }

    public static void containsCharacter(String input) {
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("INPUT :" + input + " : contains a small charecter");
        } else {
            System.out.println("INPUT : " + input + ": does not contains a small character");
        }
    }


    public static void notContainsCharacter(String input) {
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("INPUT :" + input + " : find \\W");
        } else {
            System.out.println("INPUT : " + input + ": does not find \\W");
        }
    }

    public static void containsBothSmallNLargeCharacter(String input) {
        String SMALL_REGEX = "[a-z]";
        String LARGE_REGEX = "[A-Z]";

        Pattern patternSmall = Pattern.compile(SMALL_REGEX);
        Pattern patternLarge = Pattern.compile(LARGE_REGEX);

        Matcher matcher = patternSmall.matcher(input);
        System.out.println("Input : " + input + " presence of small charecter : " + matcher.find());

        matcher.reset();
        matcher = patternLarge.matcher(input);
        System.out.println("Input : " + input + " presence of Capital charcter is : " + matcher.find());
    }

    public static void containsBothSmallLarge(String input) {
        Pattern pattern = Pattern.compile("[a-z [A-Z]]");
        Matcher matcher = pattern.matcher(input);
        System.out.println("Input : " + input + " both present = " + matcher.find());
    }

    public static List<Integer> extractNumbers(String input) {
        List<Integer> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("[0-9]");
       /* char[]inputArray = input.toCharArray();
        Matcher matcher;
        for (char c : inputArray){
            matcher = pattern.matcher(""+c);
            if(matcher.matches()){
                list.add(Integer.parseInt(""+c));
            }
            matcher.reset();
        }*/

        //using group() method of Matcher class
        Matcher matacher = pattern.matcher(input);
        while (matacher.find()) {
            list.add(Integer.parseInt(matacher.group()));
        }
        return list;
    }

    public static void isAlphaNumeric(String input) {
        Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println(input + " has both.");
        } else {
            System.out.println(input + " does not have both");
        }
    }

    public static void isUpperAndLowerCase(String input) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println(input + " has both.");
        } else {
            System.out.println(input + " does not have both");
        }

    }
}
