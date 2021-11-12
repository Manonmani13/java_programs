package TypeCasting;

public class Stri {
public static void main(String[] args) {
	String greeting = "hello";
	System.out.println(greeting);
	String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println("The length of the txt string is: " + txt.length());
	System.out.println(greeting.toUpperCase()); 
	System.out.println(txt.toLowerCase()); 
	String txt1 = "Please locate where 'locate' occurs!";
	System.out.println(txt1.indexOf("locate"));
}
}
/*
hello
The length of the txt string is: 26
HELLO
abcdefghijklmnopqrstuvwxyz
7

*/