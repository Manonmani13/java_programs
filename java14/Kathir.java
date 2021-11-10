class Kathir extends Foodlist implements Emp,Fam
{
final String name="kathir";

public static void main(String args[])
{
Kathir k=new Kathir();
System.out.println(Kathir.leaves);
//Emp.leaves=20;
Emp.jj();
k.foodlist();
k.wear();
System.out.println(k.name);
//Kathir.name="kavi
}
public void wear()
{
System.out.println("wear neet dress");
}
public void dosomething()
{
}
public void applyLeave()
{

}
}