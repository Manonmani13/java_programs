package logic;

public class SumofDigit {
public static void main(String[] args) {
	int k=565,d=0,s=0;
	while(k>0)
	{
		d=k%10;
		s=s+d;
		k=k/10;
	}
	System.out.println(s);
}
}
