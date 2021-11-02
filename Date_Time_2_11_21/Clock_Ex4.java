package Date_Time_2_11_21;

import java.time.Clock;
import java.time.Duration;

public class Clock_Ex4 {
public static void main(String[] args) {
	Clock c=Clock.systemUTC();
	Duration d = Duration.ofHours(5);  
    Clock clock = Clock.offset(c, d);    
    System.out.println(clock.instant());  
}
}
//2021-11-02T20:11:10.882740Z