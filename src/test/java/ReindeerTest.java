/*
 * This file contains JUnit test cases for Reindeer.java
 */

import org.junit.*;

import java.awt.*;

import static org.junit.Assert.*;

public class ReindeerTest {
    Reindeer reindeer;

    @Before
    public void setUp() throws Exception{
        reindeer = new Reindeer();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Grunt...", reindeer.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, reindeer.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestSetAndGetNoseColour(){
        reindeer.setNoseColour(Color.BLACK);
        assertEquals(reindeer.getNoseColour(), Color.black);
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        reindeer.upgradeSpeed();
        assertEquals(4, reindeer.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        reindeer.downgradeSpeed();
        assertEquals(-2, reindeer.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, reindeer.getPrice());
    }
}
