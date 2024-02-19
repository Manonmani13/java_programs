package logic;

public class LargestNumber3 {
public static void main(String[] args) {
	int a[]= {10,3,43};
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			System.out.println(a[i]);
		}
	}
}
}
