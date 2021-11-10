class Sasi
{
public void watchnews()
{
System.out.println("watch tv news");
}
public void takerest()
{
System.out.println("Take Rest");
}
}
public class Friend extends Sasi
{
public void watchnews()
{
System.out.println("Social media");
}
public static void main(String args[])
{
Sasi ch=new Friend();
ch.watchnews();
}
}
