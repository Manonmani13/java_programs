class parent 
{
public void writing()
{
System.out.println("write daily");
}
}
class children extends parent
{
public void read()
{
System.out.println("Read ");
}
}
public class Child2 extends parent
{
public static void main(String args[])
{
GrandChild ch=new GrandChild();
ch.writing();
//ch.read();
}
}