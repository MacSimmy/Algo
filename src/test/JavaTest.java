package test;

import junit.framework.TestCase;

/**
 * Created by mahendra.chhimwal on 6/20/2016.
 */
public class JavaTest extends TestCase {
    private int a = 10;
    private boolean b = true;

    protected void setUp(){
        a = 10;
        b = true;
    }

    // test method to add two values
    public void testAdd(){
        boolean result= a>9 && b;
        assertTrue("it juts  failed",result == true);
    }
}
