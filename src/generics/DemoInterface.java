package generics;

/**
 * Created by mahendra.chhimwal on 5/26/2016.
 */
public interface DemoInterface <T1, T2>{
    T2 doSomeOperation(T1 ti);
    T1 doAnotherOperation(T2 t2);
}
