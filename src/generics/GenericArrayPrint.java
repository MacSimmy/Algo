package generics;

import java.util.List;

/**
 * Created by mahendra.chhimwal on 5/24/2016.
 */
public class GenericArrayPrint implements DemoInterface<Integer,String > {

    public static <E> void printArray(E[] array){
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for (E element:array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };



        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
    }

    @Override
    public String doSomeOperation(Integer ti) {
        return null;
    }

    @Override
    public Integer doAnotherOperation(String  o) {
        return null;
    }
}
