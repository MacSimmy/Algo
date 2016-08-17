package base;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import doubts.Employee;
import generics.NumberCounter;
import puzzles.ArrayUtil;
import puzzles.GenUtil;

import java.util.*;

/**
 * Created by mahendra.chhimwal on 5/24/2016.
 */
public class Main {

    public static void main(String[] args) {

       /* GenUtil util = new GenUtil();
        testBitwiseOperators();
        Employee employee = new Employee();
        NumberCounter numberCounter = new NumberCounter();
        ArrayUtil arrayUtil = new ArrayUtil();*/
        //checkSet();
       // testNullListDoubt();
       // testJsonException();
        //primary();
        //testBitwiseOperators();
        //firstMethod(null);
        //testMap();
       // testGson();
        MyInterface myClass = new MyClass();
        myClass.interfaceMethod();
    }

    public static void testBitwiseOperators() {
       /* for (int i = 0; i < 15; i++) {
          *//*  //System.out.println("Binary of " + i + " is " + Integer.toString(i, 2) + " BITWISE NOT is "+ Integer.toString(~(i),2));
            int j = 15-i;*//*
            System.out.println("No of char required to buffer in string of  "+ i +"is "+ GenUtil.stringSize(i) );
        }*/
        System.out.println("octal 0500 is "+ Integer.valueOf(0500));
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

    public static void checkSet() {
        String values = "1+2+3+4+12";
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add("" + i);
        }

        List<String> dValueList = new ArrayList<>(Arrays.asList(values.split("\\+")));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add("" + i);
        }

        System.out.println("dValueList=" + dValueList.toString());
        System.out.println("set=" + set.toString());

        System.out.println("dValueList - set = ");
        dValueList.removeAll(set);
        System.out.println("dValueList=" + dValueList.toString());
        System.out.println("set=" + set.toString());
        System.out.println("values = "+ values);
    }

    private static void testNullListDoubt(){
        System.out.println("Testing null check");
        String fullString = "scscscsc";
        String[]splittedString = fullString.split("a");

        List<String>list  = new ArrayList<>(Arrays.asList(splittedString));
        System.out.println("is List is null = " + list == null);
        System.out.println("is List is empty = " +  list.isEmpty());
    }

    private static void testJsonException(){

        String nullString = null;
        System.out.println("check is " + "from".equals(nullString) );
        String json = "my error ";
        Employee employee = new Employee();
        employee.setAddress("Adress");
        employee.setId(67);
        employee.setName("mahendra");
        employee.setSalary(5245121212.11);
        Gson gson = new Gson();
        JsonObject jsonElement = (JsonObject) gson.toJsonTree(employee);
        json = json + jsonElement.toString();
        System.out.println("json   = " + jsonElement);
        System.out.println("json  String = " + json);
        Exception exception = new Exception(json);
        exception.printStackTrace();

    }

    private static void primary(){
       /* try{
            secondary();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("after exception");*/

        Employee employee = new Employee();
        employee = null;
        employee.getAddress();
    }

    private static void secondary() throws Exception{
        System.out.println("inside secondary");
        throw new Exception("Exception from secondary");
    }

    public static String aMethod() throws Exception
    {
        try /* Line 5 */
        {
            throw new Exception(); /* Line 7 */
        }
        finally /* Line 9 */
        {
            System.out.print("finally "); /* Line 11 */
            return "firstMethod";
        }
    }
    public static String firstMethod(String args[])
    {
        try
        {
            System.out.print(aMethod() +" "); /* Line 24 */;
        }
        catch (Exception e) /* Line 20 */
        {
            System.out.print("exception ");
        }
        System.out.print("finished"); /* Line 24 */
        return "firstMethod";
    }

    private static void testMap(){
        HashMap<String,String> map = new HashMap<>();
        map.put("small","This is a small value");

        System.out.println("Small " + (map.containsKey("Small")));
        System.out.println("small " + (map.containsKey("small")));
    }

    private static void testGson(){
        Gson gson = new Gson();
        Employee employee = gson.fromJson("",Employee.class);
        System.out.println("is null" + employee==null);

    }
}
