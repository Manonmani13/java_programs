public class Bank
{
public static void main(String[] args)
{
Bank cashier=new Bank();
cashier.deposit();
cashier.withdraw();
Bank customer=new Bank();
customer.deposit(500);
customer.deposit("mano");
customer.deposit(500.5f);
customer.deposit(500.5);
customer.deposit(true);

}
void deposit(int con)
{

System.out.println("deposting int "+con);
}
void deposit(String m)
{

System.out.println("deposting String "+m);
}
void deposit(float f)
{

System.out.println("deposting float"+f);
}
void deposit(double d)
{

System.out.println("deposting double "+d);
}
void deposit(boolean b)
{

System.out.println("deposting boolean "+b);
} 
void withdraw()
{
System.out.println("Withdraw");
}
void deposit()
{

System.out.println("deposting");
}
}
