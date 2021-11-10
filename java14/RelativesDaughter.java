package tamilnadu.chennai;
import tamilnadu.nativeplace.Relative;
public class RelativesDaughter extends Relative
{

RelativesDaughter(int j)
{
super(j);
System.out.println(j);
}

public static void main(String args[])
{
RelativesDaughter  rs=new RelativesDaughter(80);

rs.garden();
rs.receivepeople();
}
}

