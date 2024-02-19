package logic;

public class SumofDigitUsingRecursion {
public static void main(String[] args) {
	System.out.println(add(454));
}
static int add(int n)
{
	int sum=0;

	int d;
	if(n==0)
		return 0;
	else {
		d=n%10;
		sum=sum+d;
		return sum+add(n/10);

	}
}
}
