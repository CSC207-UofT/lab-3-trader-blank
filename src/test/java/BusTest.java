import org.junit.*;

import static org.junit.Assert.*;


public class BusTest {
    Bus b;

    @Before
    public void setUp() throws Exception {
        b = new Bus(50);
    }

    @Test(timeout = 50)
    public void TestSeats() {
        assertEquals(50, b.seats);
    }
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(80, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(85, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(75, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(15000, b.getPrice());
    }

}