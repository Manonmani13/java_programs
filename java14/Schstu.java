class Schstu
{
int roll,std;
String name;
public void information(int roll,int std,String name)
{

System.out.println("name\t"+name+"\nrollnot"+roll+"\nstd\t"+std);
}
public void information(String name,int roll)
{

System.out.println("name\t"+name+"\nrollno\t"+roll);
}
public void information(String name)
{


System.out.println("name\t"+name);
}
	public static void main(String args[])
	{
		Schstu s3=new Schstu();
		s3.information(23,21,"mano");
		//s3.information("mani",33);
		//s3.information("latha");
	}
	
}