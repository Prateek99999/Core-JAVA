import java.util.Scanner;
class WhileChecking
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);


System.out.println("enter an integer");

while(sc.hasNextInt())
{
int a=sc.nextInt();

System.out.println("u entered "+a);

System.out.println("enter anothter integer");

}


}}