public class Children extends Parent
{
String name;
public Children()
{
System.out.println("child Constructor");
}
public Children(String name)
{
super(name);
this.name=name;
System.out.println(this.name);
}


public static void main(String args[])
{
//Children ch=new Children();
Children ch2=new Children("kavin");
}
}