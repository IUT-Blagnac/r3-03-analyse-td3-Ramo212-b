package td3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWithoutParameter() {
        HelloWorld hw = new HelloWorld();
        String result = hw.hello();
        assertEquals("Hello World!", result);
    }

    @Test
    public void testHelloWithParameter() {
        HelloWorld hw = new HelloWorld();
        String param = "Bonjour!";
        String result = hw.hello(param);
        assertEquals(param, result);
    }
}
