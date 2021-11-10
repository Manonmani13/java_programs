public class School1
{
static String name;
static int rollno;
	public School1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	System.out.println("Hi how are you");	
	}
	
public static void main(String[] args)
{


	School student1=new School("kumar",124);
    School student=new School("mano",123);
	student1.study();
   student1=null;
	student.play();
student=null;

}
	public void study()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println("Study Well");
	}
	public void play()
	{
		System.out.println(name);
		System.out.println(rollno);	
		System.out.println("play Well");
	}
}
