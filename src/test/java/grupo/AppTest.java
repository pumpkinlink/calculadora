package grupo;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    public void testsomar() throws Exception {
        Assert.assertEquals(100999999998.2, App.somar(99999999999.0, 999999999.2));
    }

    public void testsubtrair() throws Exception {
        Assert.assertEquals(98999999999.8, App.subtrair(99999999999.0, 999999999.2));
    }

    public void testmultiplicar() throws Exception {
        Assert.assertEquals(99899200.8, App.multiplicar(999.0, 99999.2));
    }

    public void testdividir() throws Exception {
        Assert.assertEquals(333.3, App.dividir(999.9, 3.0));

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


}
