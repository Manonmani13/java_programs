package Date_Time_2_11_21;

import java.time.OffsetTime;

public class OffSetTime_Ex3 {
public static void main(String[] args) {
	OffsetTime offset = OffsetTime.now();  
    int m = offset.getMinute();  
    System.out.println(m+ " minute");  
}
}
//55 minute