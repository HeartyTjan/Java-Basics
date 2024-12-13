package codingChallenges;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        this(0,0,0);
    }
    public Time(int hour){
        this(hour,0,0);
    }
    public Time(int hour, int minute){
        this(hour,minute,0);
    }
    public Time(int hour, int minute, int second){
        validateTime(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }


    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String getTime(){
         return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }
    public void displayTime(String header){
         System.out.printf("%s%n %-20s%n", header, getTime());
    }
    public static void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }
    public static void validateHour(int hour){
        boolean NotAValidHour = hour < 0 || hour > 23;
        if(NotAValidHour) throw new IllegalArgumentException("hour must be above 0 and below or equal to 23");
    }
    public static void validateMinute(int minute){
        boolean NotAValidMinute = minute < 0 || minute > 59;
        if (NotAValidMinute) throw new IllegalArgumentException("Minute must be above 0 and equal or below 59");
    }
    public static void validateSecond(int second){
        boolean NotAValidSecond = second < 0 || second > 59;
        if(NotAValidSecond) throw new IllegalArgumentException("Second must be above 0 and equal or below 59");
    }
}

