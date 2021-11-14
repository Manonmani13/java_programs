package StringMethods;

import java.util.StringTokenizer;

public class HashMoreTokens {
	 public static void main(String args[])  
	 {    
	   /* StringTokenizer object */  
	   StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");    
	     /* Checks if the String has any more tokens */  
	     while (st.hasMoreTokens())   
	     {    
	         System.out.println(st.nextToken());    
	     }    
	 }   
}
/*
Demonstrating
methods
from
StringTokenizer
class

*/