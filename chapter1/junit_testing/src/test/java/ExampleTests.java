import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTests {
    private static final int TEST_LIMIT = 1000;
    private Example example;

    @BeforeEach
    public void beforeAll(){
        example = new Example();
    }

    @Test
    public void testGetMessage(){
        assertEquals("Hello, tests!",example.getMessage());
    }

    @Test
    public void testParityOdd(){
        for(int i=1;i< TEST_LIMIT;i+=2){
            assertEquals("odd",example.parity(i));
        }
    }

    @Test
    public void testDirectionValid(){
        assertEquals("up",example.direction(0));
        assertEquals("right",example.direction(1));
        assertEquals("down",example.direction(2));
        assertEquals("left",example.direction(3));

    }
    @Test
    public void testDirectionInValid()
    {
        assertEquals(null,example.direction(-1));
        assertEquals(null,example.direction(9));
    }

    @Test
    public void testgetCount(){
        assertEquals(0,example.getCount());
        assertEquals(1,example.getCount());
        assertEquals(2,example.getCount());

    }
}
