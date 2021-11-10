class Student
{
public void depart()
{
System.out.println("Bio");
}
}

class Lab extends Student
{
public void lib()
{
System.out.println("lib");
}
}
public class College extends Lab
{
public static void main(String args[])
{
College p=new College();
p.depart();
p.lib();
}
}

