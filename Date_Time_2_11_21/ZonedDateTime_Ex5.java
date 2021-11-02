package Date_Time_2_11_21;

import java.time.Period;
import java.time.ZonedDateTime;

public class ZonedDateTime_Ex5 {
	  public static void main(String[] args) {  
		    ZonedDateTime zone= ZonedDateTime.now();  
		    ZonedDateTime p = zone.plus(Period.ofDays(126));  
		    System.out.println(p);  
		  }   
}
//2022-03-08T21:09:33.215911+05:30[Asia/Kolkata]