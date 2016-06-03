package base;

import puzzles.ArrayUtil;
import puzzles.GenUtil;

/**
 * Created by mahendra.chhimwal on 5/24/2016.
 */
public class Main {

    public static void main(String[] args) {
    /*  int[] array = { 1,23,5,2,14,5852,5,5,1,5,55,1,2258,1,21};
        int secondMax = ArrayUtil.findSecondMax(array);
        System.out.println("Second Maximum is " + secondMax);*/
        //testBitwiseOperators();
        GenUtil.getFirstHighest(1432);
        //testBitwiseOperators();
    }

    public static void testBitwiseOperators() {
       /* for (int i = 0; i < 15; i++) {
          *//*  //System.out.println("Binary of " + i + " is " + Integer.toString(i, 2) + " BITWISE NOT is "+ Integer.toString(~(i),2));
            int j = 15-i;*//*
            System.out.println("No of char required to buffer in string of  "+ i +"is "+ GenUtil.stringSize(i) );
        }*/

        System.out.println("Binary of 3 = "+ Integer.toString(3,2) + " and binary of 5 = "+ Integer.toString(5, 2));
        System.out.println("BITWISE OR  of 3 na 5 is "+ (3 & 5));
        System.out.println("Left sift of 3 is  "+(3<<1));
        System.out.println("Right shift of 3 is  "+(3>>1));
        //testing zero fill right shift
        System.out.println("zero fill right shift of 3 is  "+(3>>>1));
        int anInt1 = 0b10100001010001011010000101000101;
        System.out.println(""+ anInt1);

        System.out.println("Circlular shift of 3 is "+ ((3>>>1)|(3 << (Integer.SIZE - 1))));

    }
}
