package patternapp;

public class Pattern82 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
