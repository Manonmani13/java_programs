package patternapp;

public class Pattern87 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}
