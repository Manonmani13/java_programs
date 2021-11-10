public class Bank2
{
static int bankbalabce=10000;
int balance=0;
public static void main(String args[])
{

Bank2 customer=new Bank2();
customer.deposit(1000);
Bank2 customer1=new Bank2();
customer1.balance=1000;
Bank2 customer2=new Bank2();
customer2.balance=500;

System.out.println(Bank2.bankbalabce);
System.out.println(customer1.balance);
System.out.println(customer2.balance);

//System.out.println(customer.balabce);
/*System.out.println(Bank2.balabce);
System.out.println(balabce);*/
}
void deposit(int amount)
{
System.out.println("deposited "+amount);
}
}

