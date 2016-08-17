package reflection;

/**
 * Created by mahendra.chhimwal on 7/5/2016.
 */
public class LocalInnerClass {

    public void testLocalInnerMethod(){
        class LocalOne{
            private int data =5;
            public void printData(){
                System.out.println("Local inner data is " +data);
            }

        }

        LocalOne localOne = new LocalOne();
        localOne.printData();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.testLocalInnerMethod();
    }
}
