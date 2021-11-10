public  class Calculator
{
public static void main(String args[])
{
Calculator calobj=new Calculator();
	//calobj.add(5,55);
int outcome=calobj.add(50,30);
calobj.multiply(outcome);
	System.out.println("outcome is"+outcome);
} 
public void multiply(int input)
{
System.out.println(input*10);
}
public int add(int no, int no1)
	{	
return no+no1;
}
}
/*

		 no=10;
	no1=29;
		//System.out.println(no+no1);
		//System.out.println("Result is"+(no+no1));*/
	//System.out.println(outcome);
//public int add(int no,int no1)
//int no=30,no1=40;
		//no=15;
		//no1=90;
		//return no+ no1;
//System.out.println("Add method"+no+no1);
	
