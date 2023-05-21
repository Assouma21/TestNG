import org.testng.Assert;
import org.testng.annotations.*;


    public class TestClass extends BaseTestClass {


    @Test
    public void fistTest() {
        System.out.println("inside first method");
        AddClass addClass = new AddClass();
        int res = addClass.getSum(2, 3);
        Assert.assertEquals(5, res);

    }

    @Test
    public void secondTest() {
        System.out.println("this is second test");
    }
}



