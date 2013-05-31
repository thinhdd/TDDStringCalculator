import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 5/31/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void TestEmpty()
    {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(st.add(""), 0);
    }
    @Test
    public  void TestOneDigit()
    {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(st.add("1"), 1);
        Assert.assertEquals(st.add("2"), 2);
    }
    @Test
    public void TestTwoDigit()
    {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(st.add("1,2"), 3);
        Assert.assertEquals(st.add("2,0"), 2);
    }
    @Test
    public void TestUnKnowUnmount()
    {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(st.add("1,2", "3"), 6);
        Assert.assertEquals(st.add("2,0", ""), 2);
    }
    @Test
    public void TestWithLines()
    {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(st.add("1\n2,3", "3"), 9);
        Assert.assertEquals(st.add("2\n0,2", ""), 4);
    }

}
