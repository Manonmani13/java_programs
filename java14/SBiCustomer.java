 class Statebank
{
private int balance=1000;
	 int getbalance()
	 {
		return this.balance; 
	 }
	 public void setbalance(int amount)
	 {
		 
		this.balance=this.balance+amount; 
	 }
}
public class SBiCustomer
{
public static void main(String args[])
{
Statebank sbi=new Statebank();
	//System.out.println(sbi.balance);
	System.out.println(sbi.getbalance());
	sbi.setbalance(500);
	System.out.println(sbi.getbalance());
	
	
}
}