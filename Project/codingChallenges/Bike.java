package codingChallenges;

public class Bike {

    private boolean powerStatus;
    private int speed;
    public Bike() {
        powerStatus = false;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void powerOn(){
        if(!powerStatus)powerStatus = true;
    }
    public void powerOff(){
        if(powerStatus)powerStatus = false;
    }
    public boolean isPowerStatus(){
        return powerStatus;
    }


    public void accelerate(){
        if(powerStatus){
            if(speed >=0 && speed < 20) speed++;
            if(speed >=21 && speed <30) speed +=2;
            if(speed >=31 && speed <40) speed +=3;
            if(speed >=41) speed +=4;
        }
    }

    public void deccelerate(){
        if(powerStatus){
            if(speed >=0 && speed < 20) speed--;
            if(speed >=21 && speed <30) speed -=2;
            if(speed >=31 && speed <40) speed -=3;
            if(speed >=41) speed -=4;
        }
    }

}
