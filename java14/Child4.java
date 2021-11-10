class Gparent
{
int j=10;	
void wel()
{
	
System.out.println("Welcome"+j);
}
	
}
class Parent extends Gparent
{
int j=100;
void wel()
{
//this.wel();
//System.out.println(super.j);
//super.wel();
System.out.println("welcome from Parent"+j);
}

}
public class Child4 extends Parent{
//int j=200;
public static void main(String args[])
{

Child4 n=new Child4();
//System.out.println(super.j);
n.wel();
}
/*void wel()
{
//this.wel();
System.out.println("welcome from Child");
}*/
}