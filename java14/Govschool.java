public class Govschool
{
String name;
int mark1,mark2,mark3,mark4,mark5;
long lab1,lab2,lab3;
Govschool(String name,int mark1,int mark2,int mark3,long lab1,long lab2,long lab3)
{
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
this.lab1=lab1;
this.lab2=lab2;
this.lab3=lab3;
	System.out.println("biostudent");
}
Govschool(String name,int mark1,int mark2,int mark3,long lab1,long lab2)
{	
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;

this.lab1=lab1;
this.lab2=lab2;
	System.out.println("CSE student");
}
Govschool(String name,int mark1,int mark2,int mark3,int mark4,long lab1)
{
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
this.mark4=mark4;

this.lab1=lab1;
	System.out.println("Accounts");
}
Govschool(String name,int mark1,int mark2,int mark3,int mark4,int mark5)
{
this.name=name;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
this.mark4=mark4;
this.mark5=mark5;
	System.out.println("Histroy");
}
public static void main(String args[])
{
Govschool cseStudent=new Govschool("maha",50,60,70,65l,80l);
Govschool bioStudent=new Govschool("kirthikshan",60,50,70,80l,90l,70l);
Govschool accStudent=new Govschool("mano",60,70,86,78,89l);
Govschool hisStudent=new Govschool("reka",80,90,78,67,88);
	cseStudent.admi();
	bioStudent.lead();
	accStudent.list();
	hisStudent.write();
}
	void admi()
	{
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+lab1+" "+lab2);
	
	}
	void lead()
	{
	
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+lab1+" "+lab2+" "+lab3);
    }
	void list()
	{
			
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+lab1);
	}
	void write()
	{
		System.out.println(name+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5);	
	}
}
