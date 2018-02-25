import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
int n=sc.nextInt();
int remainder;
int rev=0;
int a=n;
while(n!=0)
{
remainder=n%10;
rev=(rev*10)+remainder;
n=n/10;
}

if(a==rev)
System.out.println("No. is palindrome");

else
{
System.out.println("reverese no. :: "+rev);
System.out.println("No. isn't palindrome");
}
}
}
