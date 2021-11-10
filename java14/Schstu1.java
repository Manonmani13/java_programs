class Schstu1
{
int roll,std;
String name;
public Schstu1(String name,int roll,int std)
{
this.name=name;
this.roll=roll;
this.std=std;

}
	public Schstu1(String name)
{
this.name=name;

//System.out.println("name\t"+name);
}
public Schstu1(String name,int roll)
{
this.name=name;
this.roll=roll;

//System.out.println("name\t"+name+"\nrollno\t"+roll);
}
public static void main(String args[])
	{
		Schstu1 s3=new Schstu1("mano",22,21);
		System.out.println(s3.update());
	Schstu1 s1=new Schstu1("mani",22);
	Schstu1 s2=new Schstu1("maha");
			}
	public Schstu1 update()
	{
	Schstu1 s3=new Schstu1("mano",22,21);
		
	//System.out.println("student1 information\n"+s3.name+" \n"+s3.roll+"\n"+s3.std);
		//System.out.println(return s3);
		return s3;
	}
}