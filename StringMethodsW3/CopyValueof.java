package StringMethodsW3;

public class CopyValueof {
	  public static void main(String[] args) {
		    char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		    String myStr2 = "";
		    myStr2 = myStr2.copyValueOf(myStr1, 0, 4);
		    System.out.println("Returned String: " + myStr2);  
		  }
}
//Returned String: Hell