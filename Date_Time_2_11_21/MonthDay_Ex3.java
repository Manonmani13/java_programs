package Date_Time_2_11_21;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDay_Ex3 {
public static void main(String[] args) {
    MonthDay month = MonthDay.now();  
    long n = month.get(ChronoField.MONTH_OF_YEAR);  
    System.out.println(n);  	
}
}
//11