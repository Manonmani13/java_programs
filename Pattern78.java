package patternapp;

public class Pattern78 {
	public static void main(String[] args) {
		int k=15;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}
