import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;
public class TestCount {

    @Test
    public void test_count() {

        Count num = new Count(4, 5);

        int actual_result = num.multiply();

        int expected_result = 20;

        assertEquals(expected_result, actual_result);
        System.out.println("Result is  " + actual_result);
    }
}