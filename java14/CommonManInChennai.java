package Tamilnadu.chennai;
class CommonManInChennai implements TrafficRules
{
public static void main(String args[])
{
CommonManInChennai cm=new CommonManInChennai();
cm.goByDieselVehicle();
cm.goByBicycle();
}
public void goByDieselVehicle()
{
System.out.println("go By Diesel Vehicle");
}
public void goByBicycle()
{
System.out.println("go by Bicycle");
}
}