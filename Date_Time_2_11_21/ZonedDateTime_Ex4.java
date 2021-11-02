package Date_Time_2_11_21;

import java.time.Period;
import java.time.ZonedDateTime;

public class ZonedDateTime_Ex4 {
	public static void main(String[] args) {  
	    ZonedDateTime zone= ZonedDateTime.now();  
	    ZonedDateTime m = zone.minus(Period.ofDays(126));  
	    System.out.println(m);  
	  }   
}
//2021-06-29T21:06:40.302583+05:30[Asia/Kolkata]