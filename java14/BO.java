ipublic class BO extends HO
{
int price,discount;
int offer=1000;
public BO(int price,int discount)
{
	super(price,discount);
this.price=price;
this.discount=discount;
System.out.println("actual  amount is "+(this.price-this.discount));
}
public BO()
{
super();
}
public static void main(String args[])
{
BO tv=new BO(10000,500);
//tv.purchase();
BO f=new BO(12000,444);
f.purchase();
tv.print();

/*System.out.println(super.offer);
System.out.println(offer);
System.out.println(this.offer);*/
}
void purchase()
{
System.out.println(super.offer);
System.out.println(offer);
System.out.println(this.offer);
}

}
