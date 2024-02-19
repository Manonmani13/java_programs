package logic;

public class ExtractDigitMethod2 {
public static void main(String[] args) {
	int value=7623784,val=value,a;
	int counter=0;
	while(value>0)
	{
		value/=10;
		counter++;
	}
	while(val>0)
	{
		a=val%10;
		System.out.println("value position "+counter+" value "+a);
		val=val/10;
		counter--;

	}
}
}
