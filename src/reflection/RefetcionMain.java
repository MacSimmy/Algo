package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by mahendra.chhimwal on 7/5/2016.
 */
public class RefetcionMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        TestClass testClass = new TestClass() ;
        System.out.println(testClass.getClass().getName());
        System.out.println(TestClass.class.getName());
        System.out.println(Class.forName("reflection.TestClass").getName());
        System.out.println("isClass " +  testClass.getClass().isInterface());

        TestClass newObject = (TestClass)TestClass.class.newInstance();

        Method[] testClassMethods = TestClass.class.getDeclaredMethods();
        for (Method method:testClassMethods){
            System.out.println(method.getName() + " accessor "+ method.getReturnType());
        }

        System.out.println("Now accessing private method by creating a new object");
        Class c = Class.forName("reflection.TestClass");
        TestClass myClass = (TestClass) c.newInstance();
        Method method;
        method = c.getDeclaredMethod("print",null);

        System.out.println("accessability "+ method.isAccessible());
        System.out.println("but acessing it now");
        method.setAccessible(true);

        method.invoke(myClass,null);

    }
}


