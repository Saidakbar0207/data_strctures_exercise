package exercises.porgramming.exercise10_1;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(){}
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime) {
        elapsedTime = elapsedTime / 1000;
        this.hour = (int) elapsedTime / 3600;
        this.minute= (int) (elapsedTime%3600)/60;
        this.second = (int) elapsedTime%60;
    }
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

