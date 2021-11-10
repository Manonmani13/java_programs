 class Trainer
{
 String dept="java",institute="payilagam";
private int salary=10000;
public int getsalary()
{
	System.out.println(salary);
return this.salary;
}
Trainer(String dept,String institute)
{
this.dept=dept;
this.institute=institute;
//System.out.println(dept+"\n "+institute);	
}
	public void  training()
	{
	System.out.println("Provided good training");	
	}
public static void main(String args[])
{
Trainer trainerKumar=new Trainer("CSE","Payilagam");
}
}
class SQLTrainer extends Trainer
{
public SQLTrainer(String dept,String institute)
{
super(dept,institute);
//System.out.println(dept+"\n "+institute);
}
public static void main(String args[])
{
SQLTrainer  ram=new SQLTrainer("JAVA","Payilagam");
System.out.println(ram.dept);
System.out.println(ram.institute);
ram.training();
ram.getsalary();
}
}