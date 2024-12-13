package codingChallenges;

public class GeoZone {

    public static String confirmState(String userInput) {
        String result = "";
        for(GeoPoliticalZone zones : GeoPoliticalZone.values()) {
            for(var state: zones.getStates()) {
                if(state.equals(userInput)) {
                    result = zones.name();
                    break;
                }
            }
        }
        return result;
    }
}
