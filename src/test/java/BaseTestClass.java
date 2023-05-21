import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("inside before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        System.out.println();
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
