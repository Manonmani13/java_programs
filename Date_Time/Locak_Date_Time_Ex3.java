package Date_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Locak_Date_Time_Ex3 {
	public static void main(String[] args) {  
	    LocalDateTime a = LocalDateTime.of(2018, 2, 13, 15, 56);    
	    System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
	    System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
	    System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
	    System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
	    System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
	  }  
}
/*
2
44
13
15
956
*/