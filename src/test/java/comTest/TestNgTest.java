package comTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTest {

    @Test
    public void test(){
        System.out.println("hello");
        Assert.assertFalse(false );
    }
}
