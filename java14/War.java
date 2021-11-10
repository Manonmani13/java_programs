public class War extends Goog
{
War(String name)
{
super("kaviya");
System.out.println(name);
System.out.println("Wordpress");
}

public static void main(String args[])
{
Goog w=new War("jai");
//w.help();
}
/*protected  void help()
{
System.out.println("text me");
}
*/
}
class Goog
{ 
	String name;
Goog(String name)
{
	this.name=name;
	System.out.println("Parent constructor "+name);
}
	Goog()
	{
	System.out.println("Google ");	
	}
/*protected void help()
{
System.out.println("Contact me");
}*/
}