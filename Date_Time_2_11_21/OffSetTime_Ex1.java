package Date_Time_2_11_21;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffSetTime_Ex1 {
public static void main(String[] args) {
	OffsetTime of=OffsetTime.now();
	int h=of.get(ChronoField.HOUR_OF_DAY);
	System.out.println(h);
    int m = of.get(ChronoField.MINUTE_OF_DAY);  
    System.out.println(m);  
    int s = of.get(ChronoField.SECOND_OF_DAY);  
    System.out.println(s);  
}
}
/*
17
1072
64329

*/