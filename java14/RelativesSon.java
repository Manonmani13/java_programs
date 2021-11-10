package tamilnadu.nativeplace;
public class RelativesSon extends Relative
{

public static void main(String args[])
{
RelativesSon rs=new RelativesSon();
System.out.println(rs.i);
rs.garden();
rs.receivepeople();
rs.Hello();
}
protected void garden()
{
System.out.println("Gardening in organic way");
}
void Hello()
{
System.out.println("This is model class");
}
}

