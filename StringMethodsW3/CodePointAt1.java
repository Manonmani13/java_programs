package StringMethodsW3;

public class CodePointAt1 {
public static void main(String[] args) {
	String myStr = "Hello";
	String m="manonmani";
	int result = myStr.codePointAt(0);
	int r=m.codePointAt(5);
	System.out.println(r);
	System.out.println(result);
}
}
/*
109
72
*/