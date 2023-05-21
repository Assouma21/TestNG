import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass {
    @Test
    public void fistTest(){
        System.out.println("inside first method");
        AddClass addClass = new AddClass();
        int res= addClass.getSum(2,3);
        Assert.assertEquals(5,res);

    }
    @Test
    public void secondTest(){
        System.out.println("this is second test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        System.out.println();
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("inside before method");
    }
    @BeforeClass
    public  void beforeclass(){
        System.out.println("before class");
    }
    @AfterClass
        public void afterclass(){
            System.out.println("after class");
        }
    }


