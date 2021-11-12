package TypeCasting;

public class Assign1 {
public static void main(String[] args) {
	  int x = 100;
	    x=x% 3;
	    System.out.println(x);
	    x &= 9;
	    System.out.println(x);
	    x |= 3;
	    System.out.println(x);
	    x ^= 6;
	    System.out.println(x);
	    x >>= 2;
	    System.out.println(x);
	    x <<= 2;
	    System.out.println(x);
}
/*
 * 1
1
3
5
1
4

 */}
