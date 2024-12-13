package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {
    @Test
    public void testZones() {
        String userInput = "Abia";
        String result = GeoZone.confirmState(userInput);
        String expected = "SOUTHEAST";
        assertEquals(expected, result);
    }

}
