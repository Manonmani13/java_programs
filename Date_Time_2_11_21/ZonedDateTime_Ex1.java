package Date_Time_2_11_21;

import java.time.ZonedDateTime;

public class ZonedDateTime_Ex1 {
	public static void main(String[] args) {  
	    ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
	    System.out.println(zone);  
	  }  
}
//2016-10-05T08:20:10+05:30[Asia/Kolkata]
