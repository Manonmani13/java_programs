public class AA
{
private int resultmark=350;
int getResultmark()
{
System.out.println(resultmark);
return resultmark;
}
public void setResultmark(int mark)
{
 resultmark=resultmark+mark;
	System.out.println(resultmark);
}
public static void main(String args[])
{
	AA n=new AA();
	//int ma=n.getResultmark();
	//System.out.println(ma);
	System.out.println(n.resultmark);
	n.setResultmark(70);
	System.out.println(n.resultmark);
	AA n1=new AA();
	System.out.println(n1.resultmark);
	n1.setResultmark(2000);
	System.out.println(n1.resultmark);
	
}
	
}