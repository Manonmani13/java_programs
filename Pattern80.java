package patternapp;

public class Pattern80 {
public static void main(String[] args) {
	/*
	 * 5 9 12 14 15
	 * 4 8 11 13
	 * 3 7 10 
	 * 2 6
	 * 1
	 */
	int k=0,l=4;
	for( int i=5;i>=1;i--)
	{
		k=i; 
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k=k+l;
			l--;
		}
		l=4;
		System.out.println();
	}
}
}
