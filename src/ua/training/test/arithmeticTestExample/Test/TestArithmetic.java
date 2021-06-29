package ua.training.test.arithmeticTestExample.Test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ua.training.test.arithmeticTestExample.Calculation.Arithmetic;

public class TestArithmetic {
    private static Arithmetic arithmetic;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000);

    @BeforeClass
    public static void runT(){
        arithmetic = new Arithmetic();
    }

    /*
    * @After
    * @AfterClass
    * */


    @Test
    public void testAdd(){
        double res = arithmetic.add(3,7);
        Assert.assertEquals(res, 10.0, 0.0001);
    }

    @Test
    public void testMult(){
        double res = arithmetic.mult(3, 7);
        Assert.assertEquals(res, 21.0, 0.0001);
    }

    @Ignore
    @Test
    public void testDeduct(){
        double res = arithmetic.deduct(3, 7);
        Assert.assertEquals(res, -4, 0.0001);
    }

    @Test
    public void testDiv(){
        double res = arithmetic.div(10, 5);
        Assert.assertEquals(res, 2.0, 0.0001);
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        arithmetic.div(10.0, 0.0);
    }

    @Test//(timeout = 1000)
    public void testN(){
        while (true){}
    }
}
