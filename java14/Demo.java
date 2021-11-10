public class Demo
{
	static int rollno=99;
Demo()
{	
System.out.println("Demo constructor");	
}
	Demo(int mark)
	{
		this();
	System.out.println("Demo2 Constructor");	
	`
public static void main(String args[])
{
Demo d1=new Demo(80);
d1.print();
}
	void print()
	{
	System.out.println(this.rollno);	
	}
}