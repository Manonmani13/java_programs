package patternapp;

public class Pattern107 {
	public static void main(String[] args) {
		int k=15;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				
					System.out.print(k+" ");
					k--;

			}
			System.out.println();
		}
	}
}
