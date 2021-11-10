abstract class Moneycollector 
{
	 static int y=10;
public abstract void debtor();
	public static void money()
	{
	System.out.println("hello");
	}
}
class MSon  extends Moneycollector
{
public static void main(String args[])
{
MSon n=new MSon();
n.money();
n.debtor();
System.out.println(n.y);
}
public void debtor()
{
System.out.println("i will give give money");
}
}