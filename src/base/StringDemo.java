package base;

/**
 * Created by mahendra.chhimwal on 6/27/2016.
 */
public class StringDemo {

    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len   = palindrome.length();
        char[]tempArray = new char[len];
        char[]arrayString = new char[len];
        //putting original string in it

        for (int i = 0; i < len; i++) {
            tempArray[i] = palindrome.charAt(i);
        }

        //reversing string

        for (int i = 0; i < len; i++) {
            arrayString[i] = tempArray[len-1 - i];
        }

        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("capacity = "+ sb.capacity());
        System.out.println("length = "+ sb.length());

        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("hannah lenght = "+ hannah.length());
        System.out.println("hannah cahr at 12 = "+ hannah.charAt(12) + hannah.charAt(13));

        String reversePalindrome =
                new String(arrayString);
        System.out.println("without string Builder : " +reversePalindrome);

        System.out.println(" Now with String Builder");

        StringBuilder builder = new StringBuilder(palindrome);
        System.out.println(builder.reverse());

        char [] st = "Now reversing String with my logic".toCharArray();
        System.out.println(st);
        reverseString(st);
        System.out.println(st);
    }

    private static void reverseString(char[] array){
        int n = array.length -1;
        for (int i = (n-1)>>1; i >=0; i--) {
            int k = n-i;
            char ati  = array[i];
            char atk = array[k];
            array[i] = atk;
            array[k] = ati;
        }
    }
}
