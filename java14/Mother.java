
public class Mother extends Cook
{
Mother()
{
System.out.println("Mother cooking"); 
}
Mother(int i)
{
super(50);
System.out.println("Mother cooking"+i); 
}
public void m()
{
System.out.println(super.mark);
}
public static void main(String args[])
{
//Cook c=new Mother();
Mother m=new Mother(90);
m.m();
System.out.println(m.mark);
m.cooking();
}
public void cooking()
{
System.out.println(" learn cooking from mother");
}
}