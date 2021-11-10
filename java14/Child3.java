class Mother
{
public void depart()
{
System.out.println("Bio");
}
}

class Father 
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
public class Child3 extends Mother,Father
{
public static void main(String args[])
{
 Child3 p=new  Child3();
p.depart();
p.lib();
}
}


