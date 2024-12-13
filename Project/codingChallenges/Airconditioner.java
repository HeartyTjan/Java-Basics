package codingChallenges;

public class Airconditioner {

    private boolean powerStatus;
    private int temperature;
    private int speed;

    private final static int maxTemperature = 30;
    private final static int minTemperature = 16;

    public Airconditioner() {
        powerStatus = false;
    }

    public void powerOn(){
        powerStatus = true;
    }
    public void powerOff(){
        powerStatus = false;
    }
    public boolean isPowerStatus() {
        return powerStatus;
    }

    public void setTemperature(int temperature) {
        if(temperature <= maxTemperature) {
            if (temperature >= minTemperature) {
                this.temperature = temperature;
            }else System.out.println("temperature is at minimum");
        }else System.out.println("temperature is at Maximum");
    }

    public void increaseTemperature(){
        if(temperature < maxTemperature) {
            if (temperature >= minTemperature) temperature++;

        }else System.out.println("Cannot increase temperature. Temperature is at maximmum");
    }
    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if(temperature <= maxTemperature) {
            if (temperature > minTemperature) {
                temperature--;
            } else System.out.println("Cannot decrease temperature. Temperature is at minimum");
        }
    }
}