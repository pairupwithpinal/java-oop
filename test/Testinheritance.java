import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;

public class Testinheritance {
    @Test
    public void test_adition(){

       Inheritance1 adition   = new Inheritance1(20,10);

       adition.add();
       assertEquals(30,adition.add());
    }
}
