public  class Office
{
  int formfee=10;
 Office()
{
System.out.println("hello");
}
public static void main(String args[])
{
Office officer=new Office();
officer.doservice();
//System.out.println(officer.formfee);
officer.givesalary();
}
public void  doservice()
{
System.out.println("Government Service");
}
private void givesalary()
{
System.out.println("salary");
}
}
