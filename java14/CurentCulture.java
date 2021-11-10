abstract class Culture
{
public abstract void welcome();
public void wear()
{
System.out.println("womens wear sarees and mens wear vesti");
}
}
class CurentCulture extends Culture
{
public static  void main(String args[])
{
CurentCulture n=new CurentCulture();
n.welcome();
}
public void welcome()
{
System.out.println("hii");
}
}