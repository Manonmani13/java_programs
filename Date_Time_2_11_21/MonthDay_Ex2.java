package Date_Time_2_11_21;

import java.time.MonthDay;

public class MonthDay_Ex2 {
public static void main(String[] args) {
	MonthDay mon=MonthDay.now();
	boolean b=mon.isValidYear(2021);
	System.out.println(b);
}
}
//true