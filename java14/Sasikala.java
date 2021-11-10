abstract class jailitha
{
public abstract void payfine();
	static int i=10;
	
	 jailitha()
	{
	System.out.println("hii");	
	}
public void laptop()
{
System.out.println("provide laptop");
}
public void bicycle()
{
System.out.println("provide bicycle");
}
public void ammamess()
{
System.out.println("provide food");
}
}

class Sasikala extends jailitha
{
public static void main(String args[])
{
Sasikala s=new Sasikala();

}
public void payfine()
{
System.out.println("pay fine 100 crores");
}
}