public class Alarm {

    public static void alarmClock(int day, boolean weekend) {
        if ((day >= 1 && day <= 5) && !weekend) { 
            System.out.println("7:00");
        } else if (day == 0 && !weekend) { 
            System.out.println("10:00");
        } else {
            System.out.println("You are on vacation");
        }
    }

    public static void main(String[] args) {
        alarmClock(4, false);
        alarmClock(0, false);
        alarmClock(6, true);   
    }
}
