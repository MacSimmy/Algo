package test;


import org.junit.Test;
import sun.misc.MessageUtils;

import junit.framework.TestCase;

/**
 * Created by mahendra.chhimwal on 7/15/2016.
 */
public class TestJunit1 extends TestCase {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }


}
