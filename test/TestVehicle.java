import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestVehicle {
    @Test
    public void test_no_tires_kia(){
        Vehicle kia = new Vehicle(4,6);
        int Actual_tires = kia.getNo_tires();

        int Expected_tires = 4;
        assertEquals(Expected_tires,Actual_tires);
        System.out.println("Expected tires are as equal as " +Actual_tires);
    }
@Test
    public void test_No_seat_kia(){
        Vehicle kia = new Vehicle(4,6);
        int Actual_seat = kia.getNo_seat();
        int Expected_seat = 6;
        assertEquals(Expected_seat,Actual_seat);
    System.out.println("Expected seats are as equal as " +Actual_seat);

}

}
