package puzzles;

import doubts.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mahendra.chhimwal on 6/1/2016.
 */
public class GenUtil {

    public void checkOurEmployree(Employee employee){

    }

    private Employee employee = new Employee();

    public static int[] generateBinary(int maxDecNum) {
        int[] binary = null;

        return binary;
    }

    final static int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    // Requires positive x
    public static int stringSize(int x) {
        for (int i = 0; ; i++) {
            if (x <= sizeTable[i]) {
                return i + 1;
            }
        }
    }

    public static void printAllBinaryCombOfString(String input) {

        if (input == null || input.isEmpty()) {
            System.out.println("Empty or null string");
            return;
        }
        int maxComb = (int) Math.pow(2, input.length());
        char[] inArr = input.toCharArray();
        for (int i = 0; i < maxComb; i++) {
            char[] binary;
            //using my own implementation
            binary = leftPadString(Integer.toBinaryString(i).toCharArray(), '0', input.length());


           /* String bin = Integer.toBinaryString(i);
            int diff=inArr.length - bin.length();
            for (int j = 0; j < diff; j++) {
                bin = "0"+bin;
            }
            binary = bin.toCharArray();*/


            //using String formatter.
            //binary = String.format("%"+input.length()+"s", Integer.toBinaryString(i)).replace(' ', '0').toCharArray();

            for (int j = 0; j < binary.length; j++) {
                if (binary[j] == '1') {
                    inArr[j] = Character.toUpperCase(inArr[j]);
                } else {
                    inArr[j] = Character.toLowerCase(inArr[j]);
                }
            }
            System.out.println(inArr);
        }
    }


    private static char[] leftPadString(char[] input, char padWith, int maxLength) {
        if (input == null || input.length >= maxLength) {
            //System.out.println("Nothing to pad");
            return input;
        }
        char[] outArray = new char[maxLength];
        if (input.length < maxLength) {
            int offset = maxLength - input.length;
            for (int i = 0; i < maxLength; i++) {
                if (i < offset) {
                    outArray[i] = padWith;
                } else {
                    outArray[i] = input[i - offset];
                }
            }
        }
        return outArray;
    }

    public static void getFirstHighest(int number) {
        char[] numDigitsChar = ("" + number).toCharArray();
        Integer[] numDigits = new Integer[numDigitsChar.length];

        for (int i = 0; i < numDigitsChar.length; i++) {
            numDigits[i] = Integer.parseInt(String.valueOf(numDigitsChar[i]));
        }
      /*  int[] sortedArray = Arrays.copyOf(numDigits, numDigits.length);
        Arrays.sort(sortedArray);*/
        //main logic to find first greater number.
        boolean isNumFound = false;

        for (int i = numDigits.length - 1; i >= 0; i--) {
            if (isNumFound) {
                break;
            }
            for (int j = numDigits.length - 1; j >= 0; j--) {
                if (i != j && numDigits[i] > numDigits[j] && i > j) {
                    int temp = numDigits[i];
                    numDigits[i] = numDigits[j];
                    numDigits[j] = temp;
                    isNumFound = true;
                    if(j!=numDigits.length-1) {
                        Arrays.sort(numDigits, j + 1, numDigits.length, new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1.compareTo(o2);
                            }
                        });
                    }
                    break;
                }
            }
        }
        if (isNumFound)
            System.out.println("First large number is " + getNumFromArray(numDigits));
        else {
            System.out.println(" Not possible to compose large number than " + getNumFromArray(numDigits));
        }
    }


    private static int getNumFromArray(Integer[] a) {
        int number = 0;
        for (int i = 0; i < a.length; i++) {
            number = number + a[i] * (int) (Math.pow(10, a.length - i - 1));
        }
        return number;
    }


    public void printPermutations(String input) {
        char[]a = input.toCharArray();
        List<String>permuts = new ArrayList<>();



    }

}
