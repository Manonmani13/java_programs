package Date_Time_2_11_21;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_EX2 {
	public static void main(String[] args) {  
	    LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
	    ZoneId  india = ZoneId.of("Asia/Kolkata");   
	    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
	    System.out.println("In India Central Time Zone: " + zone1);  
	    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
	    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
	    System.out.println("In Tokyo Central Time Zone:"  + zone2);  
	  }  
}
/*
In India Central Time Zone: 2017-01-19T15:26+05:30[Asia/Kolkata]
In Tokyo Central Time Zone:2017-01-19T18:56+09:00[Asia/Tokyo]
*/