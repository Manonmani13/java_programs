class BankAccount extends CreateAccount
{
	void create()
	{
	System.out.println("Create account by online");	
	}
	void Account()
	{
	System.out.println("account");
	}
public static void main(String args[])
{
	CreateAccount ba=new BankAccount();
	ba.create();
	//ba.Account();
	ba.delete();
}
}
class CreateAccount
{
	void create()
	{
	System.out.println("create account ");	
	}
	void delete()
	{
	System.out.println("Delete account");	
	}
}