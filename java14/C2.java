class Gp
{
void wel()
{
System.out.println("welcome to Grand father house");
}
}
class P extends Gp
{
void wel()
{
System.out.println("welcome to father house");
}
}
class C extends P
{
void wel()
{
System.out.println("welcome to Child house");
}
}
class C1 extends C
{
void wel()
{
System.out.println("welcome to Child 1 house");
}
}
public class C2 extends C
{
public static void main(String args[])
{
C2 n=new C2();
n.wel();
}
void wel()
{
System.out.println("welcome to Child2 house");
}
}