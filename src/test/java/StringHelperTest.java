import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

    private StringHelper stringHelper;

    @Before
    public void setup(){

        stringHelper = new StringHelper("Basavesh");

    }

    @Test
    public void testStringLength(){

        int result = stringHelper.findLength();

        Assert.assertEquals(8,result);

    }
}
