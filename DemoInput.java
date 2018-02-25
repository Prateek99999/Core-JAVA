import java.util.Scanner;

class DemoInput
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter your name");
String s=sc.nextLine();

System.out.println("enter a no.");
int i=sc.nextInt();


double d=Math.random()*100;

System.out.println("random no. generated :: "+(int)d);
System.out.println("You entered  "+i);
System.out.println("Have a nice day  "+s);



}
}