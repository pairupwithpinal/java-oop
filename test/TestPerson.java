import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestPerson {
    @Test
    public void test_Person_info() {

        Person person = new Person(40);
        person.assignName();
        String actual_person = person.getName();

        String expected_person = "Pinal/Jatin";

        assertEquals(expected_person, actual_person);
        System.out.println("person is " + actual_person);
    }


}

