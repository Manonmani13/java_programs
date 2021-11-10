package india.newDelhi;

class CommonManInDelhi implements TrafficRule,TrafficRules
{
public static void main(String args[])
{
CommonManInDelhi cd=new CommonManInDelhi();
cd.goByDieselVehicle();
cd.goByBicycle();
}
public void goByDieselVehicle()
{
System.out.println("go By Diesel Vehicle from Delhi");
}
public void goByBicycle()
{
System.out.println("go by Bicycle Delhi ");
}
}