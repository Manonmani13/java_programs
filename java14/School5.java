public class School5
{
String name;
	static String department;
int tamil,english,maths,physics,chemistry,cs,cslab,bio,biolab;
public School5 (String department,String name,int tamil,int english,int maths,int physics,int chemistry,int cs,int cslab)
{

if(department == "CSE")
{
this.name= name;
this.tamil = tamil;
this.english = english;
this.maths = maths;
this.physics = physics;
this.chemistry = chemistry;
this.cs = cs;
this.cslab = cslab;
System.out.println("csestudent");
}
else if (department == "BIO")
{
this.name = name;
this.tamil = tamil;
this.english = english;
this.maths = maths;
this.physics = physics;
this.chemistry = chemistry;
this.bio= cs;
this.biolab = cslab;
System.out.println("bio student");
}
	System.out.println(department);
}
public static void main(String []args)
	{
	System.out.println(department);
		School5 cse=new School5("CSE","mano",60,40,50,60,70,80,90);
	    School5 bio=new School5("BIO","maha",60,40,80,607,70,80,90);
		cse.mark();
	bio.mark();
	}
	void mark()
	{
		System.out.println("name "+name);
		
		System.out.println(tamil);
		System.out.println(english);
		System.out.println(maths);
		System.out.println(physics);
		System.out.println(chemistry);
		System.out.println(cs);
		System.out.println(cslab);
	
	}
}

