package patternapp;

public class Pattern92 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)(i+j-1+64));
			}
			System.out.println();
		}
	}
}
