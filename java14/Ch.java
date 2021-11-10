
public class Ch extends Pa
{
int k = 200; 
static int l = 2000; 
Ch()
{
System.out.println("Child Constructor");
}
Ch(int no)
{
super(40);
System.out.println("Child constructor 20");
}
public static void main(String[] args)
{

Pa p = new Ch(80); // Dynamic Binding
//p.watchNews(); 
p.walk(); 
p.waterheat();
p.washing();
p.fan();

System.out.println(p.i); 
System.out.println(p.j); 
//System.out.println(p.k); 
//System.out.println(p.l); 
//p.takeRest(); 
}
public static void walk()
{
System.out.println("Going for a walk - Child");  
}/*
public void work()
{
System.out.println("Writing Java Programs"); 
}

public void watchNews()
{
System.out.println("Social Media"); 
}*/
public  void waterheat(){
System.out.println("Water from child"); 
}
public void washing()
{
System.out.println("Washing from child");
}
public static void fan()
{
System.out.println("fan");  
}



}

