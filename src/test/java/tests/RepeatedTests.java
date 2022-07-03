package tests;

import org.junit.jupiter.api.RepeatedTest;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTests {

    @RepeatedTest(10)
    public void repeatedTest(){
        assertEquals("test", "TEST".toLowerCase(Locale.ROOT));
    }
}
