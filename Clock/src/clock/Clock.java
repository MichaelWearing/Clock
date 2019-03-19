package clock;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Clock {

    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner(System.in);
        ClockLogic seconds = new ClockLogic(59);
        ClockLogic minutes = new ClockLogic(59);
        ClockLogic hours = new ClockLogic(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(user.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(user.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(user.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

       while ( true ) {
            System.out.println(hours + ":" + minutes + ":" + seconds);   // the current time printed
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                hours.next();
            }
        }
    }
}
