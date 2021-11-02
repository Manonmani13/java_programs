package Date_Time_2_11_21;

import java.time.OffsetDateTime;

public class OffSetDateTime_Ex6 {
	public static void main(String[] args) {  
	    OffsetDateTime offset = OffsetDateTime.now();  
	    OffsetDateTime value =  offset.plusDays(240);  
	    System.out.println(value);  
	  }  
}
//2022-06-30T20:20:35.409325+05:30