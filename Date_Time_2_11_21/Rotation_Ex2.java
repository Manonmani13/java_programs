package Date_Time_2_11_21;

public class Rotation_Ex2 {
public static void main(String[] args) {
	String word="dabc";
	
	char c[]=word.toCharArray();
	
	int i=0;
	/*
	 * char temp=c[i];
		c[i]=c[i+1];
		c[i+1]=c[i+2];
		c[i+2]=c[i+3];
		c[i+3]=temp;
	 * 
	 */
	char temp=c[i];
	for( i=0;i<c.length-1;i++)//0<3 1<3 2<3
	{
	c[i]=c[i+1];	//c[0]=a c[1]=b c[2]=c
	
	}
	c[i]=temp;
	//System.out.println(c.length-1);
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
	
				//System.out.println(temp);
		
	
}
}
