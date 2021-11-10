public class Bus
{
	int id;
	String name;
	Bus()
	{
	System.out.println("take ticket");	
	}
	Bus(int i,String name)
	{
		this.id=i;
		this.name=name;
	System.out.println("welcome"+id+" "+name);	
	}
	Bus(Bus s)
	{
		this.id=s.id;
		this.name=s.name;
		System.out.println(id+" "+name);
	}
	void display()
	{
		this.name="maha";
	System.out.println(id+" "+name);	
	}
public static void main(String args[])
{
//new Bus().getTicket();
	Bus ti=new Bus(10,"mano");
	Bus tick=new Bus(ti);
	//tick.id=ti.id;
	//tick.name=ti.name;
	tick.display();
	//tick.add(10l,4);
	//ti.getTicket();
	//System.out.println(args);
}
public int getTicket(int i,int j)
{
	
System.out.println("give me ticket");
	return i+j;
	//return i;
}
/*public int  add(int j,long e)
{
	
System.out.println(j+e);
}*/

}