package com.goit.gojavaonline;

import org.junit.*;

import static org.junit.Assert.*;

public class SimpleMathTest {

    private static SimpleMath simpleMath;

    @BeforeClass
    public static void setUpClass() throws Exception {
        simpleMath = new SimpleMath();
    }

    @Test(timeout = 3000)
    public void testAdd() throws Exception {
        final int a = 7;
        final int b = 12;

        final int result = simpleMath.add(a, b);

        assertEquals(a+b, result);
    }

    @Test(timeout = 3000)
    public void testSub() throws Exception {
        final int a = 7;
        final int b = 12;

        final int result = simpleMath.sub(a, b);

        assertEquals(a-b, result);
    }

    @Test(timeout = 3000)
    public void testMultiply() throws Exception {
        final int a = 7;
        final int b = 12;

        final int result = simpleMath.multiply(a, b);

        assertEquals(a*b, result);
    }

    @Test(timeout = 3000)
    public void testModulo() throws Exception {
        final int a = 17;
        final int b = 3;

        final int result = simpleMath.modulo(a, b);

        assertEquals(a%b, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {
        final int a = 17;
        final int b = 3;

        /*final int result = */simpleMath.div(a, b);

        //assertEquals(a/b, result);
    }

    /*@After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass");
    }*/
}