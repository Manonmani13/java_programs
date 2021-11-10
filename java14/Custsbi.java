class Sbibank
{
private int minimumbalance=1000;
public int getminimumbalance()
{
	System.out.println(minimumbalance);
return this.minimumbalance;
	
}
}
public class Custsbi extends Sbibank
{
public static void main(String args[])
{
Custsbi s=new Custsbi();
s.getminimumbalance();
}
}