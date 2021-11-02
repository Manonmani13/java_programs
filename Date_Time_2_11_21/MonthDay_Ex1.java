package Date_Time_2_11_21;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDay_Ex1 {
public static void main(String[] args) {
	MonthDay mon=MonthDay.now();
	LocalDate date=mon.atYear(2022);
	System.out.println(date);
}
}
//2022-11-02