import java.util.Scanner;
class StringFrequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter a string");
char s[]=new char[100];

System.out.println("Enter the character to find frequency");

s=System.in.read();


System.out.println("You entered:: "+s);
int cnt=0;

for(int i=0;s[i]!='\0';i++)
{
if(s[i]==c)
{cnt++;
}
}
System.out.println("Frequency:: "+cnt);


}
}

