public class Time {
    int hour, min, sec;
    public Time(int s){
        hour=(s/3600)%24;
        min=s%3600/60;
        sec=s%3600%60;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
