package Date_Time_2_11_21;

import java.time.Clock;

public class Clock_Ex1 {
public static void main(String[] args) {
	Clock  c=Clock.systemDefaultZone();
	System.out.println(c.getZone());
}
}
//Asia/Kolkata