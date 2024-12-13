package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void testPowerOn() {
        boolean powerStatus = false;
        Airconditioner newAC = new Airconditioner();
        newAC.powerOn();
        boolean result = newAC.isPowerStatus();
        boolean expected = true;
        assertEquals(expected, result);

    }

    @Test
    public void testPowerOff() {
        boolean powerStatus = true;
        Airconditioner newAC = new Airconditioner();
        newAC.powerOff();
        boolean result = newAC.isPowerStatus();
        boolean expected = false;
        assertEquals(expected, result);

    }
    @Test
    public void testIncreaseTemperature() {
        int temperature = 17;
        Airconditioner newAC = new Airconditioner();
        newAC.setTemperature(temperature);
        newAC.increaseTemperature();
        int increasedTemperature = newAC.getTemperature();
        int expectedIncreasedTemperature = temperature + 1;
        assertEquals(expectedIncreasedTemperature, increasedTemperature);

    }
    @Test
    public void testDecreaseTemperature() {
        int temperature = 25;
        Airconditioner newAC = new Airconditioner();
        newAC.setTemperature(temperature);
        newAC.decreaseTemperature();
        int decreasedTemperature = newAC.getTemperature();
        int expectedDecreasedTemperature = temperature - 1;
        assertEquals(expectedDecreasedTemperature, decreasedTemperature);

    }
    @Test
    public void testTemperatureDoesNotIncreaseBeyondThreshold() {
        int temperature = 30;
        Airconditioner newAC = new Airconditioner();
        newAC.setTemperature(temperature);
        newAC.increaseTemperature();
        int increasedTemperature = newAC.getTemperature();
        assertEquals(temperature, increasedTemperature);

    }

    @Test
    public void testTemperatureDoesNotDecreaseBeyondThreshold() {
        int temperature = 16;
        Airconditioner newAC = new Airconditioner();
        newAC.setTemperature(temperature);
        newAC.decreaseTemperature();
        int decreasedTemperature = newAC.getTemperature();
        assertEquals(temperature, decreasedTemperature);

    }
}
