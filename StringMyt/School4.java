
public class School4
{
String name;
int tamil,english,maths,physics,chemistry,cs,cslab,bot,zoo,biolab,acc1,acc2,acclab,his1,his2;


public School4 (String name,int tamil,int english,int maths,int physics,int chemistry,int cs,int cslab)
{
this.name = name;
this.tamil = tamil;
this.english = english;
this.maths = maths;
this.physics = physics;
this.chemistry = chemistry;
this.cs = cs;
this.cslab = cslab;
System.out.println("csestudent");
}
public School4 (String name,int tamil,int english,int maths,int acc1,int acc2,int acclab)
{
this.name = name;
this.tamil = tamil;
this.english = english;
this.maths = maths;
this.acc1 = acc1;
this.acc2 = acc2;
this.acclab = acclab;
System.out.println("accstudent");
}
public School4 (String name,int tamil,int english,int maths,int his1,int his2)
{
this.name = name;
this.tamil = tamil;
this.english = english;
this.maths = maths;
this.his1 = his1;
this.his2 = his2;
System.out.println("hisstudent");
}
public School4 (String name,int tamil,int english,int maths,int physics,int chemistry,int bot,int zoo,int biolab)
{
this.name = name;
this.tamil = tamil;
this.english = english;
this.maths = maths;
this.physics = physics;
this.chemistry = chemistry;
this.bot = bot;
this.zoo = zoo;
this.biolab = biolab;
System.out.println("biostudent");
}


public static void main(String[] args)

{
School4 csestudent1= new School4("Ram",40,50,60,35,55,77,88);
  School4 csestudent2= new School4("bala",40,50,60,35,55,77,88);
School4 biostudent= new School4("Raju",76,84,56,66,76,87,88,65);
School4 accstudent= new School4("Thilak",45,66,87,56,76,56);
School4 hisstudent= new School4("Jhon",67,98,88,65,73);
  csestudent2.marklist();
}
  void marklist()
  {
    System.out.println("Student name "+name);
    System.out.println(tamil);
    System.out.println(english);
    System.out.println(maths);
    System.out.println(physics);
    System.out.println(cs);
    System.out.println(cslab);
    System.out.println(acc1);
    
    
  }

}