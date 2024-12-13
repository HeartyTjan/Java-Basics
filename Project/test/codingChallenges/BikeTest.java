package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void testBikeOn() {
        boolean bikePowerStatus = false;
        Bike newBike = new Bike();
        newBike.powerOn();
        boolean result  = newBike.isPowerStatus();
        boolean expectedResult = true;
        assertEquals(result,expectedResult);


    }
    @Test
    public void testBikeOff() {
        boolean bikePowerStatus = true;
        Bike newBike = new Bike();
        newBike.powerOff();
        boolean result  = newBike.isPowerStatus();
        boolean expectedResult = false;
        assertEquals(result,expectedResult);


    }
    @Test
    public void testBikeAccelerationIncreaseByOneInGearOne() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(18);
        newBike.accelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 19;
        assertEquals(result,expectedResult);
    }
    @Test
    public void testBikeAccelerationIncreaseByTwoInGearTwo() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(24);
        newBike.accelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 26;
        assertEquals(result,expectedResult);
    }
    @Test
    public void testBikeAccelerationIncreaseByThreeInGearThree() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(35);
        newBike.accelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 38;
        assertEquals(result,expectedResult);
    }

    @Test
    public void testBikeAccelerationIncreaseByFourInGearFour() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(43);
        newBike.accelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 47;
        assertEquals(result,expectedResult);
    }

    @Test
    public void testBikeDeccelerationDecreaseByOneInGearOne() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(18);
        newBike.deccelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 17;
        assertEquals(result,expectedResult);
    }

    @Test
    public void testBikeDeccelerationDecreaseByTwoInGearTwo() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(24);
        newBike.deccelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 22;
        assertEquals(result,expectedResult);
    }

    @Test
    public void testBikeDeccelerationDecreaseByThreeInGearThree() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(37);
        newBike.deccelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 34;
        assertEquals(result,expectedResult);
    }

    @Test
    public void testBikeDeccelerationDecreaseByFourInGearFour() {
        Bike newBike = new Bike();
        newBike.powerOn();
        newBike.setSpeed(45);
        newBike.deccelerate();
        int result  = newBike.getSpeed();
        int expectedResult = 41;
        assertEquals(result,expectedResult);
    }


}
