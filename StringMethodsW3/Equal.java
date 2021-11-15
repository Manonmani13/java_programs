package StringMethodsW3;

public class Equal {
public static void main(String[] args) {
	String s="manonmani";
	String s2="MANONMANI";
	System.out.println(s.equalsIgnoreCase(s2));
	String s1=new String("manonmani");
	System.out.println(s.equals(s1));
}
}
//true