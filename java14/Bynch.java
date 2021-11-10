class Dyn
{
int i=1;
	static String name="mano";
Dyn()
{
	this.name=name;
	System.out.println(name);
}
	Dyn(String name)
{
	this.name=name;
	System.out.println(name);
}
}
public class Bynch extends Dyn
{
int i=20;
static String name="kirthu";
Bynch()
{
	this.name=name;
	System.out.println(name);
}
Bynch(String name)
{
	this.name=name;
	System.out.println(name);
}
public static void main(String args[])
{
Dyn n=new Bynch();
//Child ch=new Child();
System.out.println(n.i);
System.out.println(n.name);
}
}
