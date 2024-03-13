package patternapp;

public class Pattern101 {
public static void main(String[] args) {
		int k=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(k+" ");
				k=k+2;
			}
			System.out.println();
		}
	}
}
