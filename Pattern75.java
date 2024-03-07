package patternapp;

public class Pattern75 {
	public static void main(String[] args) {
		int k=5;
		for(int i=4;i>=0;i--)
		{
			for(int j=k;j>=k-i;j--)
			{
				System.out.print(j);
			}
			k++;
			System.out.println();
		}
	}
}
