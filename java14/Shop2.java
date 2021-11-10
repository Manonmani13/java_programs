 class Shop2 extends Tv
{
public static void main(String args[])
{
Shop2 customer=new Shop2();
customer.delivery();
customer.getTv();
}
public Tv getTv()
{
System.out.println("take tv sona pothuma we have to give ");
Tv sony=new Tv();
return sony;
}
}
class Tv
{
public void delivery()
{
System.out.println("free for delivery"	);
}

}