package Date_Time_2_11_21;

import java.time.Clock;

public class Clock_Ex3 {
public static void main(String[] args) {
	Clock c=Clock.systemUTC();
	System.out.println(c.instant());
}
}
//2021-11-02T15:07:42.955444Z