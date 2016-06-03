package generics;

import java.util.Comparator;

/**
 * Created by mahendra.chhimwal on 5/24/2016.
 */
public class MaximumGenerics {


    public <T extends Comparable<T>> T maximum(T x , T y , T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumGenerics test = new MaximumGenerics();
        System.out.printf( "Max of %d, %d and %d is %d\n\n",
                3, 4, 5, test.maximum( 3, 4, 5 ) );

        System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, test.maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", test.maximum( "pear", "apple", "orange" ) );
    }
}
