class Sivakumar implements Actor
{
int age;
String car;
static String address="Coimbatore";
public Sivakumar(int age,String car)
{
this.age=age;
this.car=car;
}
public static void main(String args[])
{
Sivakumar as = new Sivakumar(65,"Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println(as.address);
Actor ac=new Sivakumar(88,"Honda");
ac.act();
ac.dance();
ac.sing();
System.out.println(ac.address);
}
public void act()
{
System.out.println("Act");
}
public void dance()
{
System.out.println("Dance");
}
public void sing()
{
System.out.println("Sing");
}
public void speaking()
{
System.out.println("Speak 5 language");
}
}