import org.junit.*;

import static org.junit.Assert.*;

public class BikeTest {
    Bike b;

    @Before
    public void setUp() throws Exception {
        b = new Bike(2,300);
    }

    @Test(timeout = 50)
    public void TestCapacity() {
        assertEquals(2, b.getCapacity());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(2, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(0, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(300, b.getPrice());
    }
}
