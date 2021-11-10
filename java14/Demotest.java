
public class Demotest extends Demo
{
static String name="jai";
//System.out.println("name"+Demotest.name);
static{
System.out.println("This is static block"+name);
}
int m1,m2,m3,m4,m5,m6,m7,m8,m9;
Demotest()
{
super();
System.out.println("Demotest");
System.out.println(super.rollno);
System.out.println(this.name);
}
/*Demotest(int m1,int m2,int m3,int m4,int m5)
{
this();
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
this.m5=m5;
//System.out.println("mark"+m1);
System.out.println("Marks"+m1+" "+m2+" "+m3+" "+m4+" "+m5);
}
Demotest(int m1,int m2,int m3,int m4,int m5,int m6,int m7,int m8,int m9)
{
this(m1,m2,m3,m4,m5);
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
this.m5=m5;
this.m6=m6;
this.m7=m7;
this.m8=m8;
this.m9=m9;
System.out.println("Marks"+m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6+" "+m7+" "+m8+" "+m9);
}*/
int age=45;
public static void main(String args[])
{
System.out.println(name);
//Demotest dt=new Demotest(70,44,67,89,65);
Demotest dt=new Demotest();
//System.out.println(dt.rollno);
dt.print();
}
void print()
{

System.out.println(super.rollno);
System.out.println(this.age);

}
}