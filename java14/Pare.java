abstract class  Gpa
{
abstract void Tshirt();
public void cloths()
{
System.out.println("Vesti");
}
}
class Pare extends Gpa
{
public static void main(String args[])
{
Pare p=new Pare();
p.cloths();
p.Tshirt();
}
void Tshirt()
{
System.out.println("wear Tshirt");
}
}