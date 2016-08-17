package test;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by mahendra.chhimwal on 7/15/2016.
 */
public class TestJunit2 extends TestCase{

    int number =10;

    MessageUtil messageUtil = new MessageUtil(10);

    @Test
    public void testNumbers(){
        System.out.println("Inside testNumbers");
        assertEquals(true,number == messageUtil.getNumber());
    }

    @Test
    public void testMessage(){
        System.out.println("inside testMessage of TestJUnit2 class");
        assertEquals(true,"message"==messageUtil.printMessage());
    }
}

