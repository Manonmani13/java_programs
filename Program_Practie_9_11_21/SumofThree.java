package Program_Practie_9_11_21;

public class SumofThree {
	public static void main(String[] args) 
	{
		int i=1;
		int j=3;
		int k=4;
		int sum=0;
		
		System.out.println(i+"\n"+j+"\n"+k);
		
		while(sum<50)
		{
			sum=i+j+k;
			i=j;
			j=k;
			k=sum;
			System.out.println(sum);
		}
		
	}
}
/*
1
3
4
8
15
27
50

*/