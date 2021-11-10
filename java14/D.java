class A
{
public void depart()
{
System.out.println("Bio");
}
}

class B extends A
{
public void depart()
{
System.out.println("CS");
}
public void lib()
{
System.out.println("lib");
}
}
 class C extends A
{
public void hello()
{
System.out.println("welcome");
}
}
public class D extends B,C
{
public static void main(String args[])
{
D p=new  D();
p.depart();
p.lib();
}
}

