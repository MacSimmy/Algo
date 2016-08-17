package regex;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mahendra.chhimwal on 7/25/2016.
 */
public class RegexMain {

    public static void main(String[] args) {
       /* PatternUtil.containsDigit("mahendra chhimwal 12");
        PatternUtil.containsDigit("mahendra Singh Chhimwal");

        PatternUtil.notContainsDigit("54564654654612");
        PatternUtil.notContainsDigit("mahendra Singh Chhimwal");


        PatternUtil.containsCharacter("MAHENDRA");
        PatternUtil.containsCharacter("MahendDRA");
        PatternUtil.containsCharacter("m");


        PatternUtil.notContainsCharacter("MAHENDRA");
        PatternUtil.notContainsCharacter("MahendDRA");
        PatternUtil.notContainsCharacter("m");
        PatternUtil.notContainsCharacter("765125348@#$#%#$%^46");
*/

      /*  Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern =
                    Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher matcher =
                    pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }
    }*/

       /* PatternUtil.containsBothSmallNLargeCharacter("Mahendera");
        PatternUtil.containsBothSmallNLargeCharacter("mshenedra");
        PatternUtil.containsBothSmallNLargeCharacter("MAHENDRA");*/
   /*     PatternUtil.containsBothSmallLarge("MAHENDRA");
        PatternUtil.containsBothSmallLarge("Mahendera");
        PatternUtil.containsBothSmallLarge("mshenedra");*/

       /* System.out.println("Numbers in string Mah56bgasju786xdna87cdnha87a are : "
                + PatternUtil.extractNumbers("Mah56bgasju786xdna87cdnha87a").toString());
*/

        /*PatternUtil.isAlphaNumeric("Mahendra 78q269e4");
        PatternUtil.isAlphaNumeric("Mahendra Chhimwakj");
        PatternUtil.isAlphaNumeric("21245454545");
        PatternUtil.isAlphaNumeric("54454ascdghafujuasc");*/
        PatternUtil.isUpperAndLowerCase("Mahend ra");
        PatternUtil.isUpperAndLowerCase("mahendra chscjkg7u32y649bkasbc");
        PatternUtil.isUpperAndLowerCase("MAHENDRA");
        PatternUtil.isUpperAndLowerCase("mahendra Chhimweakl");
    }

}
