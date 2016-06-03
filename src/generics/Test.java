package generics;

import puzzles.GenUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahendra.chhimwal on 5/26/2016.
 */
public class Test {

    public static void main(String[] args) {
        //countPrimeNumber();
        long intTime = System.currentTimeMillis();
        GenUtil.printAllBinaryCombOfString("mac");
        System.out.println("Time taken is" + (System.currentTimeMillis() - intTime));
        System.out.println("Bit sequence of 7 is " + Integer.toBinaryString(7));
        System.out.println("Circular right shift of 1 is " + (7 >>> 1 | 7 << (Integer.SIZE - 1)));
    }


    private static void countPrimeNumber() {
        List<Integer> integers = new ArrayList<Integer>();
        List<Double> doubles = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            integers.add(i);
            doubles.add(i + 1.0023);
        }
        System.out.println("Total Number of prime Integer in 1 to 100 are " + new NumberCounter().countPrime(integers));
    }
}
