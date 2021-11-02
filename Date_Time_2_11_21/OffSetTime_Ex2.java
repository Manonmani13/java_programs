package Date_Time_2_11_21;

import java.time.OffsetTime;

public class OffSetTime_Ex2 {
public static void main(String[] args) {
	OffsetTime offset = OffsetTime.now();  
    int h = offset.getHour();  
    System.out.println(h+ " hour");  
}
}
//17 hour