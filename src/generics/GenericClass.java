package generics;

/**
 * Created by mahendra.chhimwal on 5/24/2016.
 */
public class GenericClass<T> {

    private T t;
    public GenericClass(T test){
        this.t = test;
    }

    public void printThisClass(){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<>(5);
        System.out.println("printing Integer");
        integerGenericClass.printThisClass();

        GenericClass<String> stringGenericClass = new GenericClass<>("I am String");
        System.out.println("printing String");
        stringGenericClass.printThisClass();

        GenericClass<Double>doubleGenericClass = new GenericClass<>(65.54);
        System.out.println("printing Double");
        doubleGenericClass.printThisClass();
    }
}
