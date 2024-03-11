package patternapp;

public class Patter94 {
	public static void main(String[] args) {
		int k=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(k+64));
				k++;
			}
			System.out.println();
		}
	}
}
