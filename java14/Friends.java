class Priya
{
void listen()
{
System.out.println("listen lesson");
}
}
class Susi extends Priya{
void speak()
{
System.out.println("Speak loud");
}
}
class Cat extends Priya
{
void smile()
{
System.out.println("smile");
}
}
public class  Friends extends Susi,Cat
{
public void friendship()
{
System.out.println("Friends forever");
}
}
