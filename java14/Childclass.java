class Superclass{
	int m1,m2;
Superclass()
{
System.out.println("Super class default constructor");

}
	Superclass(int m1)
	{
		this();
		this.m1=m1;
	System.out.println("this superclass single parameter construcotors"+m1);	
	}
	Superclass(int m1,int m2)
	{
		this(80);
		this.m1=m1;
		this.m2=m2;
	System.out.println("this superclass single parameter construcotors"+(m1+m2));	
	}
	
public static void main(String args[])
{

}
}
public class Childclass extends Superclass
{
Childclass(int mark)
{

super(mark);

}
Childclass(int mark,int mark1)
{
super(mark,mark1);
}
public static void main(String args[])
{
Childclass c=new Childclass(90);
Childclass c1=new Childclass(90,88);
}
}