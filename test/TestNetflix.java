import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;

public class TestNetflix {
    @Test

    public void test_Popular_Tv_Show() {
        Netflix tv_show = new Netflix(49);
        tv_show.populartvshow();
        String actual_show = tv_show.getTvshow();
        String expected_show = "Hunger Games";
        assertEquals(expected_show, actual_show);
        System.out.println("tv show is " + actual_show);

    }
}