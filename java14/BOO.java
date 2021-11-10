class HOO
{
static void sell()//final, static,private
{

System.out.println("sell the product");
}
public void audit()
{
System.out.println("check auditing");
}
}
public class BOO extends HOO
{
public void sell()
{
System.out.println("sell it through online");
}
public void lunch()
{
System.out.println("Eat together");
}
public static void main(String args[])
{
HOO manager=new BOO();
BOO n=new BOO();

manager.sell();
manager.audit();
n.lunch();
}
}
