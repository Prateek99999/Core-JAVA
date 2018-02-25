import java.util.Scanner;
class StringFrequency2
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the string");
String s=sc.nextLine();

System.out.println("Enter the character");
char c=(char)System.in.read();


int frequency=0;

for(int i=0; i<s.length(); ++i)
   {
       if(c==s.charAt(i))
           ++frequency;
   }

System.out.println("frequency is ::"+frequency);


}
}			 //this is  a program to find frequency of particular character in a string  entered by a user. 

