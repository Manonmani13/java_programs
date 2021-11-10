public class B
{
public static void main(String args[])
{
B n=new B();
n.m1(33);
n.m1(66,45);
n.m1(33,"mano");
n.m1("mano",45);
}
public static void m1(int i)
{

System.out.println(" first m1 method hello"+i);
}
public void m1(int i,int j)
{
System.out.println("two arguments with int dat/a type"+(i+j));
}
public void m1(int i,String name)
{
System.out.println("two arguments with int and String "+i+name);
}
public void m1(String name,int i)
{

System.out.println("String name and int "+i+name);
}
}
