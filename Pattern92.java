package patternapp;

public class Pattern92 {
	public static void main(String[] args) {
		int k=5;
		for(int i=0;i<=4;i++)
		{
			for(int j=k;j>i;j--)
			{
				System.out.print((char)(j+64));
			}
			k++;
			System.out.println();
		}
	}
}
