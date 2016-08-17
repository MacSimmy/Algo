package reflection;

/**
 * Created by mahendra.chhimwal on 7/5/2016.
 */
public class InnerClass {

    private int data = 5;

     class InnerOne{
         public void printOuterData(){
             System.out.println("Outer Data is "+ data);
         }
     }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();

        //create instance of inner class

        InnerOne innerOne =innerClass.new InnerOne();
        innerOne.printOuterData();
    }
}
