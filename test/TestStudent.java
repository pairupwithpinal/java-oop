import org.junit.jupiter.api.*;

import static junit.framework.TestCase.*;

public class TestStudent {
    @Test
    public void test_studentinfo() {
        Student s1 = new Student(290443, "Aadhya", 11);
        s1.findSchoolName();
        System.out.println(s1.getName() + " is  in " + s1.getSchool());
        assertEquals("GVHS", s1.getSchool());

    }

    @Test
    public void test_studentinfo1() {
        Student s2 = new Student(35007, "Aarya", 6);
        s2.findSchoolName();
        System.out.println(s2.getName() + " is in " + s2.getSchool());
        assertEquals("5-6 Center", s2.getSchool());
    }
    @Test
    public void test_name(){
        Student.name();



    }@Test
    public void test_studentinfo2() {
        Student s2 = new Student(35007, "Aarya", 6);
        s2.studentName();
        System.out.println("Student name is  " + s2.studentName());
        assertEquals("Aarya", s2.studentName());
    }
}
