package patternapp;

public class Pattern93 {
	public static void main(String[] args) {
		int k=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=i+k;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
			k--;
		}
	}
}
