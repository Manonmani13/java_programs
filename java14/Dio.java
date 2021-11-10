abstract class honda
{
public abstract void give_mileage();
	
	
}
class Activa extends honda
{
public  void give_mileage()
{
System.out.println("hello");

}
}
public class Dio extends Activa
{
public static void main(String args[])
{
honda d=new honda();
d.give_mileage();
Dio d=new Dio();
d.give_mileage();
}
}