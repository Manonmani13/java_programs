package patternapp;

public class Pattern76 {
public static void main(String[] args) {
	int k=5;
	for(int i=5;i>0;i--)
	{
		k=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(k);
			k++;
		}
		System.out.println();
	}
}

}
